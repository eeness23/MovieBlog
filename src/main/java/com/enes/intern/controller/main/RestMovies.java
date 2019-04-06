package com.enes.intern.controller.main;

import com.enes.intern.model.Collection;
import com.enes.intern.model.Movie;
import com.enes.intern.model.User;
import com.enes.intern.service.CollectionService;
import com.enes.intern.service.MovieService;
import com.enes.intern.service.UserService;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class RestMovies {

    private CollectionService collectionService;
    private UserService userService;
    private MovieService movieService;

    public RestMovies(CollectionService collectionService, UserService userService, MovieService movieService) {
        this.collectionService = collectionService;
        this.userService = userService;
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public Page<Movie> getMovies(@RequestParam(defaultValue = "0", name = "page") int page){
        return  movieService.getPages(page,10);
    }

    @GetMapping("/collections")
    public List<Collection> getMovies(@RequestParam("movieId") Long movieId){
        return  collectionService.getCollectionByMovieId(movieId);
    }
    @PostMapping("/collection/save")
    public ResponseEntity<String> saveCollection(@RequestParam MultiValueMap body){
        Collection collection = collectionService.findById(Long.parseLong(body.getFirst("collectionId").toString()));
        Movie movie =movieService.findById(Long.parseLong(body.getFirst("movieId").toString()));
        User user =userService.findById(Long.parseLong(body.getFirst("userId").toString()));
        if(collection.getMovies().contains(movie)){
            return new ResponseEntity<>("You cant add same movie to same collection", HttpStatus.NOT_ACCEPTABLE);
        }else {
            collection.addMovie(movie);
        }
        if(!collection.getUsers().contains(user)){
            collection.addUser(user);
        }
        System.out.println(2323);
        collectionService.save(collection);
       return new ResponseEntity<>("Succesfully", HttpStatus.OK) ;
    }

}

