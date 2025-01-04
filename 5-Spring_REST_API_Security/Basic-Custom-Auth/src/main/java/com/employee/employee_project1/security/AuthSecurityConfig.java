package com.employee.employee_project1.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AuthSecurityConfig{

    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {
        UserDetails sarthak = User.builder()
                .username("Sarthak")
                .password("{noop}Sarthak@123")
                .roles("EMPLOYEE")
                .build();

        UserDetails shraddha = User.builder()
                .username("Shraddha")
                .password("{noop}Shraddha@123")
                .roles("MANAGER")
                .build();

        UserDetails madhav = User.builder()
                .username("Madhav")
                .password("{noop}Madhav@123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(sarthak,madhav,shraddha);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests(configure ->
                configure
                        .requestMatchers(HttpMethod.GET , "api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE , "api/employees").hasRole("Admin")
                );

        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf -> csrf.disable());

        return http.build();

    }

}