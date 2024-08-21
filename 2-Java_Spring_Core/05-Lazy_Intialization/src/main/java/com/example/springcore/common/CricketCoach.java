package com.example.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("I am constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Daily work out is drink water";
    }
}
