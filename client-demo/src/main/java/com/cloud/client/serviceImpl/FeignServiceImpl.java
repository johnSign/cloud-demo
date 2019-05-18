package com.cloud.client.serviceImpl;

import com.cloud.client.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * Feign调用服务错误回调
 */
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String testDescription() {
        return "error-client";
    }

    @Override
    public String testConfig() {
        return "error-client";
    }
}
