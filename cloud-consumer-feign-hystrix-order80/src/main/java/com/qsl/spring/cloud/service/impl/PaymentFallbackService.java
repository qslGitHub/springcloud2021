package com.qsl.spring.cloud.service.impl;

import com.qsl.spring.cloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Author sileiqiang
 * @create 2021/7/4 10:24 下午
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
