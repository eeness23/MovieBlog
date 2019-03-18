package com.enes.intern.service;



import com.enes.intern.model.User;
import com.enes.intern.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
   private final UserRepository userRepository;
   private final RoleService roleService;
   private final BCryptPasswordEncoder encoder ;

    @Autowired
    public UserService(UserRepository userRepository,RoleService roleService) {
        this.roleService = roleService;
        this.userRepository = userRepository;
        encoder=new BCryptPasswordEncoder();
    }

    public User register (User user) throws RuntimeException{

        String secret = "{bcrypt}"+ encoder.encode(user.getPassword());
        user.setPassword(secret);

        user.addRole(roleService.findByName("ROLE_USER"));

        save(user);
        return user;

    }

    public User save(User user){
        if(user.getPassword().indexOf("{bcrypt}") ==-1){
            String secret = "{bcrypt}"+ encoder.encode(user.getPassword());
            user.setPassword(secret);
        }
     return userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User findById(Long id){
        return userRepository.findById(id).get();
    }
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
