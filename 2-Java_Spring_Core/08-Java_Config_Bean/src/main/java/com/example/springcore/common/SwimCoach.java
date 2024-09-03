package com.example.springcore.common;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do Swimming Properly";
    }

    public SwimCoach() {
        System.out.println("I am Swim Coach" + getClass().getSimpleName());
    }


}
