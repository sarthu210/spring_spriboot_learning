package com.example.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FootBall implements Coach{

    public FootBall(){
        System.out.println("I am constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Play FootBall";
    }
}
