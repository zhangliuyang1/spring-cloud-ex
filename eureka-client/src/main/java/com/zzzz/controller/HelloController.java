package com.zzzz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zly on 2019/3/21.
 */
@RestController
public class HelloController {



    @RequestMapping(value = "/index")
    public String index(){
        System.out.println(1111111111);
        return "hello world";
    }
}
