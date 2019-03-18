package com.enes.intern.repository;

import com.enes.intern.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

    @Query("select m from Movie m")
    List<Movie> getAll();

    Optional<Movie> findById(Long id);

    void deleteById(Long id);
}
