package com.enes.intern.controller.admin;

import com.enes.intern.model.Category;
import com.enes.intern.model.Movie;
import com.enes.intern.service.CategoryService;
import com.enes.intern.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

    private CategoryService categoryService;
    private MovieService movieService;

    public CategoryController(CategoryService categoryService, MovieService movieService) {
        this.categoryService = categoryService;
        this.movieService = movieService;
    }

    @GetMapping("/new")
    public String create(Model model){
        model.addAttribute("category",new Category());
        return "admin/category/newAndEdit";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id , Model model){
        model.addAttribute("category",categoryService.findById(id));
        return "admin/category/newAndEdit";
    }

    @GetMapping(path = {"/",""})
    public String home(Model model){
        model.addAttribute("categories",categoryService.findAll());
        return "admin/category/index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("category") Category category){
        categoryService.save(category);
        return "redirect:/admin/category";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("categoryId") Long id){
       Category temp = categoryService.findById(id);
        Set<Movie> movies = temp.getMovies();
       for(Movie m : movies){
          m.getCategories().remove(temp);
           movieService.save(m);
       }
        categoryService.deleteById(id);
        return "redirect:/admin/category";
    }

}
