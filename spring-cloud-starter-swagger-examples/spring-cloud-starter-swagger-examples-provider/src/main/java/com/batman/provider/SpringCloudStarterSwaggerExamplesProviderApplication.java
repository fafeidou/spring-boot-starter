package com.batman.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.batman")
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudStarterSwaggerExamplesProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStarterSwaggerExamplesProviderApplication.class, args);
    }

}
