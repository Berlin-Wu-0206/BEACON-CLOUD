package com.mashibing.smsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zjw
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SmsGatewayStarterApp {

    public static void main(String[] args) {
        SpringApplication.run(SmsGatewayStarterApp.class,args);
    }

}
