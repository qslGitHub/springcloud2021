package com.qsl.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author sileiqiang
 * @create 2021/6/28 10:41 下午
 */
public interface PaymentService {
    /**
     */
    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);

    public String paymentCircuitBreaker(@PathVariable("id") Integer id);


}
