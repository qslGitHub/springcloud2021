package com.qsl.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        int i = 10/0;
        return "------testB";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "dealHandlertestHotkey")
    public String testHotKey(@RequestParam(value = "p1",required = false)String p1,
                             @RequestParam(value = "p2",required = false)String p2){
        return "------testHotKey";
    }

    //兜底方法
    public String dealHandlertestHotkey(String p1, String p2, BlockException exception){
        return "----dealHandlertestHotkey";
    }
}
