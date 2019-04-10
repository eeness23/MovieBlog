package com.enes.intern.controller.main;

import com.enes.intern.model.User;
import com.enes.intern.service.*;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping("/")
public class HomeController {

    private MovieService movieService;
    private CategoryService categoryService;
    private CollectionService collectionService;
    private CastService castService;
    private UserService userService;

    public HomeController(MovieService movieService, CategoryService categoryService, CollectionService collectionService, CastService castService, UserService userService) {
        this.movieService = movieService;
        this.categoryService = categoryService;
        this.collectionService = collectionService;
        this.castService = castService;
        this.userService = userService;
    }

    @GetMapping(value = {"/", ""})
    public String home(Model model, Authentication authentication) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("randomMovies", movieService.getRandomMovies());
        addCollectionButtonControl(model, authentication);
        return "main/home";
    }

    @GetMapping("/movie/{id}")
    public String detail(Model model, @PathVariable("id") Long id, Authentication authentication) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("movie", movieService.findById(id));
        addCollectionButtonControl(model, authentication);
        return "main/detail";
    }

    private void addCollectionButtonControl(Model model, Authentication authentication) {
        model.addAttribute("addCollection", false);
        if (authentication != null && authentication.isAuthenticated()) {
            User user = userService.findById( ((User) authentication.getPrincipal()).getId());
            if (user.getCollections().size() > 0) {
                model.addAttribute("user", user);
                model.addAttribute("addCollection", true);
                model.addAttribute("collections", collectionService.getCollectionByUserId(user.getId()));
            }
        }
    }

    @GetMapping(value = {"/category/{id}"})
    public String category(Model model, @RequestParam(defaultValue = "0") int page, @PathVariable("id") Long id) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("category", categoryService.findById(id));
        model.addAttribute("movies", categoryService.getMoviesByCategoryId(id));
        return "main/category";
    }


    @GetMapping("/profil")
    public String profil(Model model, Authentication authentication) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("user", (User) authentication.getPrincipal());
        return "main/profil";
    }

    @GetMapping("/search")
    public String search(@RequestParam("find") Optional<String> name, Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("casts", castService.getCastBySearchName(name.orElse("--")));
        model.addAttribute("movies", movieService.getMoviesBySearchName(name.orElse("--")));
        return "main/search";
    }

    @GetMapping("/casts/{id}/movies")
    public String showMoviesOfCast(@PathVariable("id") Optional<Long> id, Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("castName", castService.findById(id.orElse(0L)).getName());
        model.addAttribute("movies", movieService.getMoviesByCastId(id.orElse(0L)));
        return "main/castMovie";
    }

}
