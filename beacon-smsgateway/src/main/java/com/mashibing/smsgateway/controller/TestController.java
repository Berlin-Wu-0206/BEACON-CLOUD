package com.mashibing.smsgateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Berlin
 * @description
 */
@RestController
public class TestController {

    @Resource
    private ThreadPoolExecutor cmppSubmitPool;

    @GetMapping("/test")
    public String test(){
        cmppSubmitPool.execute(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        return "ok!";
    }

}
