package com.example.telega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TelegaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegaApplication.class, args);
    }

}
