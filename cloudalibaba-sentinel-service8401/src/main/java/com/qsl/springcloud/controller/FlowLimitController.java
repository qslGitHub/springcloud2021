package com.qsl.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author sileiqiang
 * @create 2021/8/4 10:37 下午
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String TestA(){
        try{
//            TimeUnit.MILLISECONDS.sleep(800);
            Thread.currentThread().sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "testA";
    }
    @GetMapping("/testB")
    public String testB()
    {
        log.info(Thread.currentThread().getName()+"\t"+"...testB");
        return "------testB";
    }

}
