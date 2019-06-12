package com.batman.springcloudstarterswaggerexamplesgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.batman")
@SpringBootApplication
public class SpringCloudStarterSwaggerExamplesGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStarterSwaggerExamplesGatewayApplication.class, args);
    }

}
