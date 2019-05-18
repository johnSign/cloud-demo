package com.cloud.client.controller;

import com.cloud.client.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * consul客户端
 */
@RestController
public class Client {
    @Autowired
    private FeignService feignClient;   //注入feign


    @GetMapping("/descriptions")
    public String testDescription(){
        return feignClient.testDescription();
    }

    @GetMapping("/configs")
    public String testConfig(){
        return feignClient.testConfig();
    }

}
