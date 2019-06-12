package com.batman.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudStarterSwaggerExamplesEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStarterSwaggerExamplesEurekaApplication.class, args);
    }

}
