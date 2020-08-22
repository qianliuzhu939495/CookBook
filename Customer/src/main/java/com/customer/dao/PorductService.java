package com.customer.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 客户端服务：向服务器端发送器请求，调用接口
@FeignClient(value = "cloud-zull",fallback = PorductServiceImpl.class)
public interface PorductService {

    // 映射请求路径：请求服务端的接口路径,调用方法a时，向生产者发送请求，请求路径是user/getUser
    // porducta
    @RequestMapping("/pta/user/getUser")
    String a();

    @RequestMapping("/ptb/order/select")
    String select();
}
