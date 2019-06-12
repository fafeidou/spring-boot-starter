package com.batman.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Batman.qin
 * @Date 2019/6/12 13:33
 */
@RestController
public class DemoController {

    @RequestMapping("hello")
    public String hello() {
        return "hello world";
    }
}
