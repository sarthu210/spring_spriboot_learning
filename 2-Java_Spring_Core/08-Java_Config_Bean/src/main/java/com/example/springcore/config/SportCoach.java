package com.example.springcore.config;

import com.example.springcore.common.Coach;
import com.example.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportCoach {

    @Bean("madhav")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
