package com.enes.intern.controller.admin;

import com.enes.intern.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminHomeController {

    @GetMapping("/admin")
    public String home(Authentication authentication, Model model){
        model.addAttribute("user", (User)authentication.getPrincipal());
        return "admin/home";
    }

    @GetMapping("/403")
    public String accessDenied(Authentication authentication,Model model){
        model.addAttribute("userName",((User) authentication.getPrincipal()).getName());
        return "admin/403";
    }
}
