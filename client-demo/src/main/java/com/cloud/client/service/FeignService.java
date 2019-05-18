package com.cloud.client.service;

import com.cloud.client.serviceImpl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FeignClient服务调用
 */
@FeignClient(value = "my-first-consul-service" , fallback = FeignServiceImpl.class)
public interface FeignService {

    @GetMapping("/description")
    String testDescription();

    @GetMapping("/config")
    String testConfig();
}
