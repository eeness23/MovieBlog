package com.enes.intern.controller.admin;


import com.enes.intern.model.Collection;
import com.enes.intern.model.Movie;
import com.enes.intern.model.User;
import com.enes.intern.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;


@Controller
@RequestMapping("/admin/collection")
public class CollectionController {

    private CollectionService collectionService;
    private MovieService movieService;
    private UserService userService;

    public CollectionController(CollectionService collectionService, MovieService movieService, UserService userService) {
        this.collectionService = collectionService;
        this.movieService = movieService;
        this.userService = userService;
    }


    @GetMapping(path = {"/", ""})
    public String home(Model model) {
        model.addAttribute("collections", collectionService.findAll());
        return "admin/collection/index";
    }


    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("collection", collectionService.findById(id));
        return "admin/collection/newAndEdit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("collection") Collection collection) {
        collectionService.save(collection);
        return "redirect:/admin/collection";
    }


    @GetMapping("/delete")
    public String deleteUser(@RequestParam("collectionId") Long id) {
        Collection temp = collectionService.findById(id);
        Set<Movie> movies = temp.getMovies();
        Set<User> users = temp.getUsers();
        Set<Collection> tempCollection = new HashSet<>();
        for (Movie m : movies) {
                tempCollection = m.getCollections();
                tempCollection.remove(temp);
                m.setCollections(tempCollection);
                movieService.save(m);
        }
        for (User u : users) {
                tempCollection = u.getCollections();
                tempCollection.remove(temp);
                u.setCollections(tempCollection);
                userService.save(u);
        }
        collectionService.deleteById(id);
        return "redirect:/admin/collection";
    }

}
