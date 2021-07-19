package com.qsl.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sileiqiang
 * @create 2021/7/15 10:53 下午
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String configInfo()
    {
        //serverPort: 3366 configInfo: master branch,springcloud-config/config-dev.yml version=7
        return "serverPort: "+serverPort+"\t\n\n configInfo: "+configInfo;
    }
}
