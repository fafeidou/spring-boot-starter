package com.batman.swagger.model_one.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Batman.qin
 * @Date 2019/6/11 18:56
 */
@RequestMapping("model_one")
@Api(tags = {"model_one"}, description = "model_one")
@RestController
public class ModelOneController {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
