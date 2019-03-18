package com.enes.intern.controller.auth;

import com.enes.intern.model.User;
import com.enes.intern.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){
         return "auth/login";
     }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("user" , new User());
        model.addAttribute("success" , false);
        return "auth/register";
    }

    @PostMapping("/register")
    public String registerNew(@Valid User user, BindingResult bindingResult, Model model , RedirectAttributes redirectAttributes){
            if(bindingResult.hasErrors()){
                model.addAttribute("user",user);
                model.addAttribute("validationErrors",bindingResult.getAllErrors());
                return "auth/register";
            }else {
                if(!user.getConfirmPassword().equals(user.getPassword())){
                    model.addAttribute("user",user);
                    model.addAttribute("samePassword",false);
                    return "auth/register";
                }
                User newUser = userService.register(user);
                redirectAttributes
                        .addAttribute("id",newUser.getId())
                        .addFlashAttribute("success",true);
                return "redirect:/register";
            }


    }
}
