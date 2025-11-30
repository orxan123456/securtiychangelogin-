package com.task.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserDetailService  {

    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails user = User
                .withUsername("admin")
                .password("{noop}12345")

                .build();
        return new InMemoryUserDetailsManager(user);
    }



}
