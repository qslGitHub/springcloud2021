package com.qsl.springcloud.controller;

import com.qsl.springcloud.entities.CommonResult;
import com.qsl.springcloud.entities.Payment;
import com.qsl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author sileiqiang
 * @create 2021/6/11 10:54 下午
 */
//@RequestMapping("/paymentController")
@RestController
@Slf4j
public class PaymentController {
    @Resource
    public PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult creat(Payment payment){
        int result=paymentService.creat(payment);
        log.info("数据插入结果："+result);
        if(result>0){
            return new CommonResult(200,"插入数据成功！serverPort: "+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据失败！",null);
        }
    }
    //http://127.0.0.1:8761/payment/get/1  http://localhost:8001/paymentController/payment/get/2
    //Postman - http://localhost:8001/paymentController/payment/create?serial=魅族17
    @GetMapping( value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment=paymentService.getPaymentById(id);
        log.info("查询数据结果："+payment+"*******");
        if(payment!=null){
            return new CommonResult(200,"查询数据成功！serverPort: "+serverPort,payment);
        }else {
            return new CommonResult(444,"查询数据失败！查询id"+id,null);
        }
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
