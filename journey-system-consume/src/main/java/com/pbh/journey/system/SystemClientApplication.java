package com.pbh.journey.system;

import com.pbh.journey.system.common.util.ServerPortUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author pangbohuan
 * @description 系统管理服务的消费端
 */
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class SystemClientApplication {
    public static void main(String[] args) {
        ServerPortUtils.getSolePort(args);
        SpringApplication.run(SystemClientApplication.class, args);
    }
}
