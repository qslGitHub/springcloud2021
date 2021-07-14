package com.qsl.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sileiqiang
 * @create 2021/6/27 10:33 下午
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger .Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
