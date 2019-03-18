package com.enes.intern.repository;

import com.enes.intern.model.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CollectionRepository extends JpaRepository<Collection,Long> {
    @Query("select c from Collection c")
    List<Collection> getAll();

    Collection save(Collection collection);

    @Override
    Optional<Collection> findById(Long id);
    Optional<Collection> findByName(String name);
}
