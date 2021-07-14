package com.qsl.springcloud.service.impl;

import com.qsl.springcloud.dao.PaymentDao;
import com.qsl.springcloud.entities.Payment;
import com.qsl.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author sileiqiang
 * @create 2021/6/11 10:46 下午
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    public int creat(Payment payment){
        return paymentDao.creat(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
