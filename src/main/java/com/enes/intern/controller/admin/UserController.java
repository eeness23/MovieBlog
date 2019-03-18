package com.enes.intern.controller.admin;

import com.enes.intern.model.User;
import com.enes.intern.repository.UserRepository;
import com.enes.intern.service.RoleService;
import com.enes.intern.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    private UserService userService;
    private RoleService roleService;

    public UserController(UserService userService,RoleService roleService) {
        this.userService = userService;
        this.roleService=roleService;
    }

    @GetMapping(path = {"","/"})
     public String showUsers(Model model){
       model.addAttribute("users",userService.getAll());
       return "admin/user/index";
    }
    @GetMapping("/{id}/edit")

    public String editUser(@PathVariable("id") long id , Model model){
        model.addAttribute("user",userService.findById(id));
        model.addAttribute("multiCheckboxSelectedValues" , roleService.getAll());
        return "admin/user/edit";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user){
        System.out.println(user.getEmail() +" " + user.getName() + " " + user.getPassword() + " "+ user.getRoles());
        userService.save(user);
        return "redirect:/admin/user";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("userId") Long id){
        userService.deleteById(id);
        return "redirect:/admin/user";
    }
}
