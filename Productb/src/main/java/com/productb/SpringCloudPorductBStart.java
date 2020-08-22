package com.productb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 注册为eureka客户端,EnableEurekaClient只能在eureka注册中心进行注册，EnableDiscoveryClient可以其他注册中心注册
// @EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudPorductBStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPorductBStart.class,args);
    }
}
