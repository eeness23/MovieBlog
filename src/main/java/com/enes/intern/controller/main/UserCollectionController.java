package com.enes.intern.controller.main;

import com.enes.intern.model.Collection;
import com.enes.intern.model.User;
import com.enes.intern.service.CategoryService;
import com.enes.intern.service.CollectionService;
import com.enes.intern.service.MovieService;
import com.enes.intern.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserCollectionController {

    private CollectionService collectionService;
    private UserService userService;
    private CategoryService categoryService;
    private MovieService movieService;

    public UserCollectionController(CollectionService collectionService, UserService userService, CategoryService categoryService, MovieService movieService) {
        this.collectionService = collectionService;
        this.userService = userService;
        this.categoryService = categoryService;
        this.movieService = movieService;
    }

    @GetMapping("/collections")
    public String getCollections(Model model,Authentication authentication){
        if(authentication!=null && authentication.isAuthenticated()){
            User user = (User) authentication.getPrincipal();
            model.addAttribute("userId",user.getId());
            model.addAttribute("userName",user.getName());
        }else {
            model.addAttribute("userId",0);
        }
        model.addAttribute("changeTitle",false);
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("collections",collectionService.findAll());
        return "main/collection";
    }

    @GetMapping("/collections/{id}")
    public String getCollection(@PathVariable("id") Long id,Model model){
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("collection",collectionService.findById(id));
        return "main/collectionDetails";
    }

    @GetMapping("/user/{userid}/collections")
    public String getCollectionsByUserID(@PathVariable("userid") Long userId,Model model,Authentication authentication){
        User user = userService.findById(userId);
       if(authentication!=null && authentication.isAuthenticated()){
           model.addAttribute("userName",user.getName());

           User authUser = (User) authentication.getPrincipal();
           model.addAttribute("userId",authUser.getId());
       }else{
           model.addAttribute("userId",0);
           model.addAttribute("userName",user.getName());
       }
        model.addAttribute("changeTitle",true);
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("collections",collectionService.getCollectionByUserId(userId));
        return "main/collection";
    }

    @GetMapping("/user/{userId}/collections/{collectionId}/edit")
    public String editCollection(@PathVariable("userId")Long userId, @PathVariable("collectionId") Long collectionId, Model model, Authentication authentication){
        User user = (User) authentication.getPrincipal();
        if(user.getId()!=userId){
            model.addAttribute("changeUser",true);
            return "/login";
        }
        model.addAttribute("movies",movieService.findAll());
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("collection",collectionService.findById(collectionId));
        return "main/editCollection";
    }

    @GetMapping("/collection/new")
    public String createCollection(Model model, Authentication authentication){
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("collection",new Collection());
        model.addAttribute("user",(User)authentication.getPrincipal());
        return "main/createCollection";
    }

    @PostMapping("/collection/save")
    public String save(@ModelAttribute("collection")Collection collection,Authentication authentication){
        collection.addUser(userService.findById(((User)authentication.getPrincipal()).getId()));
        collectionService.save(collection);
        return "redirect:/";
    }

    @GetMapping("/user/{userId}/collections/{collectionId}/delete")
    public String delete(@PathVariable("collectionId") Long collectionId, @PathVariable("userId") Long userId, Authentication authentication,RedirectAttributes redirectAttributes){
        if(authentication.isAuthenticated() && ((User)authentication.getPrincipal()).getId()==userId){
            collectionService.deleteById(collectionId);
            redirectAttributes.addFlashAttribute("success",1);
        }else {
            redirectAttributes.addFlashAttribute("success",0);
        }
        return "redirect:/";
    }
}
