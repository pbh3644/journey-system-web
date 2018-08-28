package com.cmrh.journey.system.server.impl;

import com.cmrh.journey.system.server.WordServer;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author pangbohuan
 * @description 断路器 调用远程接口失败的时候调用
 * @date 2018-08-15 10:04
 **/
@Service
public class WordServerImpl implements WordServer {

    @Override
    public String getWord(Map<String, String> map) {
        return "Hystrix fallback";
    }
}
