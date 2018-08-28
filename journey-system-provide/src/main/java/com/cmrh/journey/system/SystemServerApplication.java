package com.cmrh.journey.system;

import com.cmrh.journey.system.common.util.ServerPortUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author pangbh
 * @description 系统管理服务的提供端
 */
@EnableEurekaClient
@SpringBootApplication
public class SystemServerApplication {

    public static void main(String[] args) {
        ServerPortUtils.getSolePort(args);
        SpringApplication.run(SystemServerApplication.class, args);
    }
}
