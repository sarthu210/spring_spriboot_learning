package com.example.springcore.rest;

import com.example.springcore.common.Coach;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private Coach myCoach;

    @Autowired
    public MyRestController(@Qualifier("cricketCoach") Coach theCoah)
    {
        System.out.println("I am constructor: " + getClass().getSimpleName());
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
