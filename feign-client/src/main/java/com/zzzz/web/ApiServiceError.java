package com.zzzz.web;

import org.springframework.stereotype.Component;

/**
 * Created by zly on 2019/3/21.
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "service is unaviable";
    }
}
