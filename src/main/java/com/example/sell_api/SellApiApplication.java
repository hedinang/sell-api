package com.example.sell_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SellApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellApiApplication.class, args);
    }
}
