package com.zp.study.feign.service;

import org.springframework.stereotype.Component;

/**
 * @program: springcloud-demo-eureka
 * @description: 错误页面
 * @author: Mr.ZP
 * @create: 2020-08-24 18:33
 **/
@Component
public class ApiServiceError implements ApiService{
    @Override
    public String index() {
        return "服务发生故障!";
    }
}
