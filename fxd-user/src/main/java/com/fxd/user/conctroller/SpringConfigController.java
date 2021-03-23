package com.fxd.user.conctroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhc
 * @Date 2021/3/17 0:56
 */
@RestController
public class SpringConfigController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/hello")
    public String hello(){
        return serverPort;
    }
}
