package com.batman.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.batman")
public class SpringBootStarterSwaggerExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterSwaggerExamplesApplication.class, args);
    }

}
