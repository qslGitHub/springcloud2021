package com.qsl.springcloud.ribbonLB;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author sileiqiang
 * @create 2021/6/23 10:59 下午
 */
public interface LoadBalancer {

    ServiceInstance getInstance(List<ServiceInstance> serviceInstances);
}
