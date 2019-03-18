package com.enes.intern.controller.admin;

import com.enes.intern.model.Cast;
import com.enes.intern.model.Movie;
import com.enes.intern.model.Role;
import com.enes.intern.model.User;
import com.enes.intern.service.CastService;
import com.enes.intern.service.MovieService;
import com.enes.intern.service.RoleService;
import com.enes.intern.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/admin/role")
public class RoleController {

    private UserService userService;
    private RoleService roleService;

    public RoleController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/new")
    public String create(Model model){
        model.addAttribute("role",new Role());
        return "admin/role/newAndEdit";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id , Model model){
        model.addAttribute("role",roleService.findById(id));
        return "admin/role/newAndEdit";
    }

    @GetMapping(path = {"/",""})
    public String home(Model model){
        model.addAttribute("roles",roleService.getAll());
        return "admin/role/index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("role") Role role){
        roleService.save(role);
        return "redirect:/admin/role";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("roleId") Long id){
       Role temp = roleService.findById(id);
       Collection<User> users = temp.getUserCollection();
       for(User u : users){
          if(u.getRoles().contains(roleService.findById(id))){
              Set<Role> roles = u.getRoles();
              roles.remove(roleService.findById(id));
              u.setRoles(roles);
              userService.save(u);
          }
       }
        roleService.deleteById(id);
        return "redirect:/admin/role";
    }

}
