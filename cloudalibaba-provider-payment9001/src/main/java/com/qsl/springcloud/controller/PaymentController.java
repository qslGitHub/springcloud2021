package com.qsl.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sileiqiang
 * @create 2021/7/29 10:42 下午
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    //http://127.0.0.1:9001/payment/nacos/1
    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }

}
