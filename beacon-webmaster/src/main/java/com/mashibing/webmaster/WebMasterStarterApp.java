package com.mashibing.webmaster;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.UUID;

/**
 * @author zjw
 * @description
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mashibing.webmaster.mapper")
@EnableFeignClients
public class WebMasterStarterApp {

    public static void main(String[] args) {
        SpringApplication.run(WebMasterStarterApp.class,args);
    }

}
