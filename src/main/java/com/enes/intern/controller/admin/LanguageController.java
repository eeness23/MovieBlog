package com.enes.intern.controller.admin;

import com.enes.intern.model.Language;
import com.enes.intern.model.Movie;
import com.enes.intern.service.CastService;
import com.enes.intern.service.LanguageService;
import com.enes.intern.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequestMapping("/admin/language")
public class LanguageController {

    private CastService castService;
    private MovieService movieService;
    private LanguageService languageService;

    public LanguageController(CastService castService, MovieService movieService, LanguageService languageService) {
        this.castService = castService;
        this.movieService = movieService;
        this.languageService = languageService;
    }

    @GetMapping("/new")
    public String create(Model model){
        model.addAttribute("language",new Language());
        return "admin/language/newAndEdit";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id , Model model){
        model.addAttribute("cast",languageService.findById(id));
        return "admin/language/newAndEdit";
    }

    @GetMapping(path = {"/",""})
    public String home(Model model){
        model.addAttribute("langs",languageService.findAll());
        return "admin/language/index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("language") Language language){
        languageService.save(language);
        return "redirect:/admin/language";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("languageId") Long id){
       Language temp = languageService.findById(id);
       Set<Movie> movies= temp.getMovies();
       for(Movie m : movies){
           m.setLanguage(languageService.findByName("Deleted Language"));
           movieService.save(m);
       }
        languageService.deleteById(id);
        return "redirect:/admin/language";
    }

}
