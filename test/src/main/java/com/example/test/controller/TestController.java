package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create bySeptember
 * 2019/6/25
 * 16:23
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("test1");
        return "test";
    }
}
