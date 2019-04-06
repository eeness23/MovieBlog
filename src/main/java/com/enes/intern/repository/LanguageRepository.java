package com.enes.intern.repository;

import com.enes.intern.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Long> {
    Optional<Language> findByName(String name);
    void deleteById(Long id);
}
