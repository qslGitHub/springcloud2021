package com.qsl.springcloud.service;

import com.qsl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author sileiqiang
 * @create 2021/6/11 10:45 下午
 */
public interface PaymentService {
    public int creat(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
