package com.example.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("I am constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doDefualtConstruction() {
        System.out.println("Default Construction" + getClass().getSimpleName());
    }

    @PreDestroy
    public void doDestroyConstruction(){
        System.out.println("Defucalt Concstruction Desrtoyed" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Daily work out is drink water";
    }
}
