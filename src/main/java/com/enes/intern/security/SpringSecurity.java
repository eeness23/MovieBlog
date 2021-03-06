package com.enes.intern.security;

import com.enes.intern.controller.auth.MyAuthenticationSuccessHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter {

    private MyAuthenticationSuccessHandler successHandler;

    private UserDetailsServiceImpl userDetailsService;

    public SpringSecurity(MyAuthenticationSuccessHandler successHandler, UserDetailsServiceImpl userDetailsService) {
        this.successHandler = successHandler;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/",
                        "/admin/css/**",
                        "/admin/js/**",
                        "/admin/images/**",
                        "/images/**",
                        "/movieImage/**.**").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/profil/").hasRole("USER")
                .antMatchers("/collection/new").hasRole("USER")
                .and()
                .exceptionHandling().accessDeniedPage("/403")
                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("email")
                .successHandler(successHandler)
                .permitAll()
                .and()
                .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login?logout")
                .permitAll()
                .and()
                .csrf().disable()  // You have to write if u want to see database
                .headers().frameOptions().disable(); // You have to write if u want to see database





    }
}
