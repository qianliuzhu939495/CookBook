package com.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 将当前应用程序注册为Eureka得服务（注册中心，管理服务）
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServerStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerStart.class,args);
    }
}

