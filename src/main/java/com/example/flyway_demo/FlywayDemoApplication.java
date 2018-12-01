package com.example.flyway_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FlywayDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FlywayDemoApplication.class, args);
    }
}
