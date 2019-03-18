package com.enes.intern.controller.admin;

import com.enes.intern.model.Movie;
import com.enes.intern.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/movie")
public class MovieController {

    private MovieService movieService;
    private CastService castService;
    private CategoryService categoryService;
    private LanguageService languageService;

    public MovieController(MovieService movieService, CastService castService, CategoryService categoryService, LanguageService languageService) {
        this.movieService = movieService;
        this.castService = castService;
        this.categoryService = categoryService;
        this.languageService = languageService;
    }

    @GetMapping("/new")
    public String create(Model model){
        model.addAttribute("movie",new Movie());
        model.addAttribute("casts" ,castService.findAllByOOrderByNameAsc());
        model.addAttribute("languages" ,languageService.getAll());
        model.addAttribute("categories" ,categoryService.getAll());
        return "admin/movie/newAndEdit";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id , Model model){
        model.addAttribute("movie",movieService.findById(id));
        model.addAttribute("casts" ,castService.findAllByOOrderByNameAsc());
        model.addAttribute("languages" ,languageService.getAll());
        model.addAttribute("categories" ,categoryService.getAll());
        return "admin/movie/newAndEdit";
    }

    @GetMapping(path = {"/",""})
    public String home(Model model){
        model.addAttribute("movies",movieService.getAll());
        return "admin/movie/index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("movie") Movie movie){
        movieService.save(movie);
        return "redirect:/admin/movie";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("movieId") Long id){
        movieService.deleteById(id);
        return "redirect:/admin/movie";
    }

    @GetMapping("/{id}/show")
    public String show(@PathVariable("id") Long id,Model model){
        model.addAttribute("movie",movieService.findById(id));
        return "admin/movie/show";
    }

}
