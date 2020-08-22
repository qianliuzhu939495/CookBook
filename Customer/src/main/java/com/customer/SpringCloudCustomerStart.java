package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// 注册为eureka客户端,EnableEurekaClient只能在eureka注册中心进行注册，EnableDiscoveryClient可以其他注册中心注册
// @EnableEurekaClient
// 注册为feign得客户端，可以向服务端发送http请求，调用对应的接口
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudCustomerStart {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCustomerStart.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
