package com.enes.intern.repository;

import com.enes.intern.model.Category;
import com.enes.intern.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("SELECT c.movies FROM Category c WHERE c.id = :id")
    List<Movie> getMoviesByCategoryId(@Param("id") Long id);
}
