package com.enes.intern.service;

import com.enes.intern.model.Role;
import com.enes.intern.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role save(Role role){
        return roleRepository.save(role);
    }
    public List<Role> findAll(){return roleRepository.findAll();}
    public Role findByName(String name){
        return roleRepository.findByName(name).get();
    }
    public Role findById(Long id) {return roleRepository.findById(id).get();}
    public void deleteById(Long id){roleRepository.deleteById(id);}
}
