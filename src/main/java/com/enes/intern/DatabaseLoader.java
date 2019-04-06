package com.enes.intern;

import com.enes.intern.model.*;
import com.enes.intern.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private CastService castService;
    private CategoryService categoryService;
    private CollectionService collectionService;
    private LanguageService languageService;
    private MovieService movieService;
    private RoleService roleService;
    private SettingService settingService;
    private final UserService userService;

    public DatabaseLoader(CastService castService, CategoryService categoryService,
                           LanguageService languageService,CollectionService collectionService,
                          MovieService movieService, RoleService roleService,
                          SettingService settingService, UserService userService) {

        this.castService = castService;
        this.categoryService = categoryService;
        this.collectionService=collectionService;
        this.languageService = languageService;
        this.movieService = movieService;
        this.roleService = roleService;
        this.settingService = settingService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
    /*    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String a = "{bcrypt}"+encoder.encode("admin");
        String ab = "{bcrypt}"+encoder.encode("user");
        User admin = new User("admin","admin@gmail.com",a);
        admin.setConfirmPassword(a);
        admin.addRole(roleService.findByName("ROLE_ADMIN"));
        admin.addRole(roleService.findByName("ROLE_USER"));
        userService.save(admin);

        User user = new User("user","user@gmail.com",ab);
        user.addRole(roleService.findByName("ROLE_USER"));
        userService.save(user);*/
    }
}
