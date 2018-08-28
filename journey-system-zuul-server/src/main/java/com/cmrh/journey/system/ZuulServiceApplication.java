package com.cmrh.journey.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author pangbohuan
 * @description 路由转发、权限控制、安全操作过滤器
 * @date 2018-08-17 10:59
 **/
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class, args);
    }
}
