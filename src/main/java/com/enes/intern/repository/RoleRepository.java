package com.enes.intern.repository;


import com.enes.intern.model.Role;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    @Query("select r from Role r")
    List<Role> getAll();

    @Override
    Optional<Role> findById(Long id);

    Optional<Role> findByName(String name);
    void deleteById(Long id);
}
