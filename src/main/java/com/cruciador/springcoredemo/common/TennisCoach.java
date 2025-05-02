package com.cruciador.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach () {
        System.out.println("In constructor :: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practise your backhend volley";
    }
}
