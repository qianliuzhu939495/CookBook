package com.producta1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser")
    public String getUser(){
        return "PorductA--分片一负载均衡一";
    }

    @RequestMapping("getUserById")
    public Integer getUserById(Integer id){
        return id;
    }
}
