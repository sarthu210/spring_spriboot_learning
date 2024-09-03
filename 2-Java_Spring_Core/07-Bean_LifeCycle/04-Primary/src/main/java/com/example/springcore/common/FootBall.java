package com.example.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class FootBall implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play FootBall";
    }
}
