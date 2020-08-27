package com.zp.study.feign.controller;

import com.zp.study.feign.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo-eureka
 * @description: 熔断器
 * @author: Mr.ZP
 * @create: 2020-08-24 19:31
 **/

@RestController
public class ApiController {



    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }
}
