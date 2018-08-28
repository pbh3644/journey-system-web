package com.cmrh.journey.system.server;

import com.cmrh.journey.system.server.impl.WordServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

/**
 * @author pangbohuan
 * @description Feign 伪造接口
 * @date 2018-08-15 10:22
 **/
@FeignClient(value = "journey-system-provide", path = "/word/", fallback = WordServerImpl.class)
public interface WordServer {

    @PostMapping(value = "word")
    String getWord(Map<String, String> map);
}
