package com.cruciador.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach () {
        System.out.println("In constructor :: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartup() {
        System.out.println("Inside startup init method");
    }

    // define our destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("Doing some clean up stuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes";
    }
}
