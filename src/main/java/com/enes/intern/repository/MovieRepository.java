package com.enes.intern.repository;

import com.enes.intern.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

    Optional<Movie> findById(Long id);
    void deleteById(Long id);

    @Query(nativeQuery=true, value="SELECT *  FROM movie ORDER BY RAND() LIMIT 9")
    List<Movie> getRandomMovie();

    @Query("select m from Movie m where name like %?1%")
    List<Movie> getMoviesBySearchName(String name);

    @Query("select c.movies from Cast c where name like %?1%")
    List<Movie> getCastMoviesBySearchName(String name);

    @Query("select c.movies from Cast c where c.id= ?1")
    List<Movie> getMoviesByCastId(Long id);
}
