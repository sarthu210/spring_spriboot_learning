package com.example.springcore.rest;

import com.example.springcore.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private Coach myCoach;

    public MyRestController(Coach theCoah)
    {
        myCoach = theCoah;
    }

    @GetMapping("/")
    public String getBug(){
        return "Hello Sarthak";
    }

    @GetMapping("/get")
    public String getData(){
        return "Hello Sarthak";
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkOut()
    {
        return myCoach.getDailyWorkout();
    }
}
