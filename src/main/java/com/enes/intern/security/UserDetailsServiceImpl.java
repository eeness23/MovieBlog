package com.enes.intern.security;

import com.enes.intern.model.User;
import com.enes.intern.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserService userService;

    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
         Optional< User > user = userService.findByEmail(email);
         if(!user.isPresent()){
             throw new UsernameNotFoundException(email);
         }
       return  user.get();
    }
}
