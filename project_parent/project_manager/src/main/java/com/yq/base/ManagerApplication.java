package com.yq.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
//开启网关
@EnableZuulProxy
@SpringBootApplication
public class ManagerApplication {
    public static void main(String[] args)  {

        SpringApplication.run( ManagerApplication.class);
    }
}
