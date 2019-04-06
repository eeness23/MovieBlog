package com.enes.intern.repository;

import com.enes.intern.model.Collection;
import com.enes.intern.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CollectionRepository extends JpaRepository<Collection,Long> {
    Optional<Collection> findByName(String name);

    @Query("SELECT u.collections FROM User u WHERE u.id =:id")
    List<Collection> getCollectionByUserId(@Param("id") Long id);

    @Query("SELECT m.collections FROM Movie m WHERE m.id =:id")
    List<Collection> getCollectionByMovieId(@Param("id") Long id);
}
