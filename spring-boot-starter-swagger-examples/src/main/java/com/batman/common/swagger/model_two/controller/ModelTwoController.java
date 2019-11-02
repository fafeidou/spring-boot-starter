package com.batman.common.swagger.model_two.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Batman.qin
 * @Date 2019/6/11 18:56
 */
@RequestMapping("model_two")
@Api(tags = {"model_two"}, description = "model_two")
@RestController
public class ModelTwoController {

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
