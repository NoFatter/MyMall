package com.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Project name:MyMall
 * Author: NoFat
 * Create time:2022/7/14 20:32
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
    }
}
