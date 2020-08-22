package com.customer.controller;

import com.customer.dao.PorductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    PorductService porductService;

    @RequestMapping("test")
    public String test(){
        return porductService.a();
    }

    @RequestMapping("select")
    public String select(){
        return porductService.select();
    }

    @RequestMapping("insert")
    public String insert(){
        return "s";
    }
}
