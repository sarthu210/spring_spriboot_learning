package com.example.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play Base Ball";
    }
}
