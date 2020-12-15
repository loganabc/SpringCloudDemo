package com.work.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/web/hello")
    public String hello(){


        //逻辑判断省略

        //调用SpringCloud服务提供者提供的服务
        return restTemplate.getForEntity("http://localhost:8090/service/hello",String.class).getBody();


    }
}
