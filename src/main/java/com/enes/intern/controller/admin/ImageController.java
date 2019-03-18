package com.enes.intern.controller.admin;

import com.enes.intern.model.Movie;
import com.enes.intern.service.ImageService;
import com.enes.intern.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("/admin/image")
public class ImageController {
    private ImageService imageService;
    private MovieService movieService;

    public ImageController(ImageService imageService, MovieService movieService) {
        this.imageService = imageService;
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public String newImagePage(@PathVariable("id") Long id , Model model){
        model.addAttribute("id",id);
        return "admin/movie/image";
    }

    @PostMapping("/save")
    public String saveImage(@RequestParam("imageFile")MultipartFile imageFile,@RequestParam("movieId") Long id){
        try {
            imageService.saveImage(imageFile,id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/admin/movie/";
    }
}
