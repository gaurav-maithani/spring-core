package com.cruciador.springcoredemo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach() { // the method name here is the default bean_id for the @Qualifier identification
        return new SwimCoach();
    }

    @Bean("aquatic")
    public Coach swimCoachRandom() {
        //this bean will
        return new SwimCoach();
    }
}
