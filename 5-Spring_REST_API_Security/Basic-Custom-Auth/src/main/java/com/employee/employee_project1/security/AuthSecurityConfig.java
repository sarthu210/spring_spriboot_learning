package com.employee.employee_project1.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AuthSecurityConfig{

    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {
        UserDetails sarthak = User.builder()
                .username("Sarthak")
                .password("{noop}Sarthak@123")
                .roles("STUDENT")
                .build();

        UserDetails shraddha = User.builder()
                .username("Shraddha")
                .password("{noop}Shraddha@123")
                .roles("STUDENT","FRIEND","WIFE")
                .build();

        UserDetails madhav = User.builder()
                .username("Madhav")
                .password("{noop}Madhav@123")
                .roles("STUDENT" , "FRIEND")
                .build();

        return new InMemoryUserDetailsManager(sarthak,madhav,shraddha);
    }

}