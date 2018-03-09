package com.examples.myproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/23.
 */
@RestController
public class HelloWordController {

    @RequestMapping("/hello")
    public String index(){
        return "hello word";
    }
}
