package com.batman.swagger.config;

import com.batman.swagger.domain.Node;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Batman.qin
 * @create 2018-12-10 10:57
 */
@Component
@ConfigurationProperties("batman.swagger-resource")
@Data
public class SwaggerResourceConfig {
    private List<Node> nodes = new ArrayList<>();

}
