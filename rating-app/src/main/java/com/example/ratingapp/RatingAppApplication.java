package com.example.ratingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(RatingAppApplication.class, args);
    }
}
