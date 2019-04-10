package com.enes.intern.repository;

import com.enes.intern.model.Cast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CastRepository extends JpaRepository<Cast,Long> {
    List<Cast> findAllByOrderByNameAsc();

    Optional<Cast> findById(Long id);
    void deleteById(Long id);

    @Query("select c from Cast c where name like %?1%")
    List<Cast> getCastBySearchName(String name);

}
