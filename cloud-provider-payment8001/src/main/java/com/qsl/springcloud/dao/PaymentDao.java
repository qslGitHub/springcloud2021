package com.qsl.springcloud.dao;

import com.qsl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author sileiqiang
 * @create 2021/6/11 10:16 下午
 */
@Mapper
public interface PaymentDao {
    public int creat(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
