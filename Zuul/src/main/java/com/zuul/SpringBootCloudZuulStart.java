package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// 启用网关代理
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringBootCloudZuulStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudZuulStart.class,args);
    }
}
