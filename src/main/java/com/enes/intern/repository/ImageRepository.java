package com.enes.intern.repository;

import com.enes.intern.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
     Image findByName(String name);

     boolean existsByName(String name);

     Image findImageByMovieId(Long id);

     void deleteByMovieId(Long id);
}
