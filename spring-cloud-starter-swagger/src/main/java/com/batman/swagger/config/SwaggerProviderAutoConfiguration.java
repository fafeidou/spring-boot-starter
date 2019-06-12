package com.batman.swagger.config;

import com.batman.swagger.domain.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Primary
@Configuration
@EnableConfigurationProperties(value = SwaggerResourceConfig.class)
@EnableAutoConfiguration
public class SwaggerProviderAutoConfiguration implements SwaggerResourcesProvider {
    public static final String API_URI = "/v2/api-docs";
    @Autowired
    private SwaggerResourceConfig swaggerResourceConfig;

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        if (!CollectionUtils.isEmpty(swaggerResourceConfig.getNodes())) {
            for (Node node : swaggerResourceConfig.getNodes()) {
                resources.add(swaggerResource(node.getName(), node.getLocation(), node.getVersion()));
            }
        }
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}

