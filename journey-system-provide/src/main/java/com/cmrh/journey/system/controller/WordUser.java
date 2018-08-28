package com.cmrh.journey.system.controller;

import com.cmrh.journey.system.common.util.IpUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author pangbohuan
 * @description 测试
 * @date 2018-08-13 14:04
 **/
@RestController
@RequestMapping("/word/")
public class WordUser {

    @Resource
    private HttpServletRequest request;

    @PostMapping("/word")
    public String hello(@RequestBody Map<String, String> map) {
        System.out.println(IpUtils.getRealIP(request) + "==========" + request.getRemotePort());

        System.out.println(map.toString() + "=================");
        return "word";
    }
}
