package com.enes.intern.controller.main;

        import com.enes.intern.service.CategoryService;
        import com.enes.intern.service.MovieService;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    private MovieService movieService;
    private CategoryService categoryService;

    public HomeController(MovieService movieService, CategoryService categoryService) {
        this.movieService = movieService;
        this.categoryService = categoryService;
    }

    @GetMapping(value = {"/",""})
    public String home(Model model){
        model.addAttribute("categories",categoryService.getAll());
        return "main/home";
    }
}
