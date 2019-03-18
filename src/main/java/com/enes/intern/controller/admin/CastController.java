package com.enes.intern.controller.admin;

import com.enes.intern.model.Cast;
import com.enes.intern.model.Movie;
import com.enes.intern.service.CastService;
import com.enes.intern.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/admin/cast")
public class CastController {

    private CastService castService;
    private MovieService movieService;

    public CastController(CastService castService, MovieService movieService) {
        this.castService = castService;
        this.movieService = movieService;
    }

    @GetMapping("/new")
    public String create(Model model){
        model.addAttribute("cast",new Cast());
        return "admin/cast/newAndEdit";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id , Model model){
        model.addAttribute("cast",castService.findById(id));
        return "admin/cast/newAndEdit";
    }

    @GetMapping(path = {"/",""})
    public String home(Model model){
        model.addAttribute("casts",castService.findAllByOOrderByNameAsc());
        return "admin/cast/index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("cast") Cast cast){
        castService.save(cast);
        return "redirect:/admin/cast";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("castId") Long id){
       Cast temp = castService.findById(id);
      Set<Movie> movies= temp.getMovies();
       for(Movie m : movies){
         m.getCasts().remove(temp);
           movieService.save(m);
       }
        castService.deleteById(id);
        return "redirect:/admin/cast";
    }

}
