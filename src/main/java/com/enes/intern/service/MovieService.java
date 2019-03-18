package com.enes.intern.service;


import com.enes.intern.model.Movie;
import com.enes.intern.repository.MovieRepository;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getAll(){
        return movieRepository.getAll();
    }

    public Movie findById(Long id){return movieRepository.findById(id).get();}

    public void deleteById(Long id){
         movieRepository.deleteById(id);
    }
}
