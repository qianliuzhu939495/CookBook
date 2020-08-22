package com.producta1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class producta1Application {
    public static void main(String[] args) {
        SpringApplication.run(producta1Application.class,args);
    }
}
