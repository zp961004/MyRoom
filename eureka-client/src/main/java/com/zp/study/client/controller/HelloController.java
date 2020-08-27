package com.zp.study.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    /**
     *
     * @param
     * @return: java.lang.String
     * @Author: Mr.ZP
     * @Date: 2020/8/20
     */
    @RequestMapping("/index")
    public String index(){
        return "好好学习，天天向上！ 端口" + port;
    }
}
