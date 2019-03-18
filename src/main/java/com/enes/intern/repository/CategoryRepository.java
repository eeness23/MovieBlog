package com.enes.intern.repository;

import com.enes.intern.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("select c from Category c")
    List<Category> getAll();

    @Override
    Optional<Category> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
