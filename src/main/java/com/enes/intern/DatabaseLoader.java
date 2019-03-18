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
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String a = "{bcrypt}"+encoder.encode("1");
        Category korku = new Category("korku");
        Category zalim = new Category("Zalimlar");
        Category komedi= new Category("komedi");
        Language tr = new Language("türkce");
        Language eng = new Language("ingilizce");
        Cast enes = new Cast("enes");
        Cast ahmet = new Cast("ahmet");
        Cast zulfu = new Cast("zülfü");
        Cast goksel = new Cast("göksel");
        Role userRole = new Role("ROLE_USER");
        Role adminRole =new Role("ROLE_ADMIN");

/*        roleService.save(userRole);
        roleService.save(adminRole);*/


        User userEnes = new User("enes","adada@hotmail.com",a);
        userEnes.setConfirmPassword(a);
        userEnes.addRole(userRole);
   /*     userService.save(userEnes);*/
        User userAdmin = new User("enes","1@hotmail.com",a);
        userAdmin.setConfirmPassword(a);
        userAdmin.addRoles(new HashSet<>(Arrays.asList(userRole,adminRole)));
       /* userService.save(userAdmin);*/

      //  FileSystemUtils.deleteRecursively(new File("src\\main\\resources\\static\\images"));
      //  Files.createDirectory(Paths.get("src\\main\\resources\\static\\images"));

       /* Movie movie = new Movie("title",1995,"dadadada adasda");
        Movie movie2 = new Movie("movie2",1995,"dadadada da");
        Movie movie3 = new Movie("movie3",1995,"dadadada da");
        movie.addCast(enes);
        movie.addCast(ahmet);
        movie.addCast(zulfu);
        movie.addCast(goksel);
        movie.setCategory(korku);
        movie2.setCategory(komedi);
        movie3.setCategory(zalim);
        movie.setLanguage(tr);
        movie2.setLanguage(tr);
        movie3.setLanguage(tr);
        Collection collection = new Collection("collection 1");
        collection.addMovie(movie);
        collection.addMovie(movie2);
        Collection collection2 = new Collection("collection 2");
        collection2.addMovie(movie3);
*/
      /*  languageService.save(tr);
        languageService.save(eng);
        categoryService.save(zalim);
        categoryService.save(komedi);
        categoryService.save(korku);
        castService.save(enes);
        castService.save(ahmet);
        castService.save(zulfu);
        castService.save(goksel);
        movieService.save(movie);
        movieService.save(movie2);
        movieService.save(movie3);
        collection.addUser(userAdmin);
        collection.addUser(userEnes);
        collection2.addUser(userEnes);
        collectionService.save(collection);
        collectionService.save(collection2);*/


    }
}
