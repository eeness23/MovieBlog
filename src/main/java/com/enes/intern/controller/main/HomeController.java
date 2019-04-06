package com.enes.intern.controller.main;

import com.enes.intern.model.User;
import com.enes.intern.service.CategoryService;
import com.enes.intern.service.CollectionService;
import com.enes.intern.service.MovieService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {

    private MovieService movieService;
    private CategoryService categoryService;
    private CollectionService collectionService;

    public HomeController(MovieService movieService, CategoryService categoryService, CollectionService collectionService) {
        this.movieService = movieService;
        this.categoryService = categoryService;
        this.collectionService = collectionService;
    }

    @GetMapping(value = {"/", ""})
    public String home(Model model,Authentication authentication) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("randomMovies",movieService.getRandomMovies());
        addCollection(model, authentication);
        return "main/home";
    }


    @GetMapping(value = {"/category/{id}"})
    public String category(Model model, @RequestParam(defaultValue = "0") int page,@PathVariable("id") Long id) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("category",categoryService.findById(id));
        model.addAttribute("movies",categoryService.getMoviesByCategoryId(id));
        return "main/category";
    }


    @GetMapping("/movie/{id}")
    public String detail(Model model, @PathVariable("id") Long id,Authentication authentication){
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("movie", movieService.findById(id));
        addCollection(model, authentication);
        return "main/detail";
    }

    private void addCollection(Model model, Authentication authentication) {
        model.addAttribute("addCollection",false);
        if(authentication!=null && authentication.isAuthenticated()){
            User user = (User) authentication.getPrincipal();
            if( user.getCollections().size()>0){
                model.addAttribute("user",user);
                model.addAttribute("addCollection",true);
                model.addAttribute("collections",collectionService.getCollectionByUserId(user.getId()));
            }
        }
    }

    @GetMapping("/profil")
    public String profil(Model model,Authentication authentication){
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("user",(User)authentication.getPrincipal());
        return "main/profil";
    }


}
