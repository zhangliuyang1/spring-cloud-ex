package com.zzzz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zly on 2019/3/21.
 */
@RestController
public class ApiController {


    @Autowired
    private ApiService apiService;


    @RequestMapping(value = "index")
    public String index(){
        return apiService.index();
    }
}
