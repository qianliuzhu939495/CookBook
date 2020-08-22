package com.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 将当前应用程序注册为Eureka得服务（注册中心，管理服务）
@EnableEurekaServer
@SpringBootApplication
public class SpringBootCloudServer2 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudServer2.class,args);
    }
}
