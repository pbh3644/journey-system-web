package com.pbh.journey.system.controller;

import com.pbh.journey.system.common.util.IpUtils;
import com.pbh.journey.system.server.WordServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author pangbohuan
 * @description 测试
 * @date 2018-08-13 14:04
 **/
@RestController
@RequestMapping("/hello/")
public class HelloUser {

    private final static Logger logger = LoggerFactory.getLogger(HelloUser.class);

    @Resource
    private WordServer wordServer;

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private HttpServletRequest request;

    @GetMapping("hello")
    public String hello(String key) {
        System.out.println(IpUtils.getRealIP(request) + "==========" + request.getRemotePort());
        boolean sign = redisTemplate.hasKey(key);
        ValueOperations<String, Map<String, String>> operations = redisTemplate.opsForValue();
        Map<String, String> map = new ConcurrentHashMap<>(16);
        if (sign) {
            map = operations.get(key);
        } else {
            for (int i = 0; i < 10; i++) {
                map.put(i + "", i + "张三");
            }
            operations.set(key, map, 10, TimeUnit.SECONDS);
        }
        String body = wordServer.getWord(map);
        return "hello " + body;
    }
}
