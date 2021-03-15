package com.fxd.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author zhc
 * @Date 2021/3/15 19:11
 */
@EnableZuulProxy
@SpringBootApplication
public class FxdZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(FxdZuulApplication.class,args);
    }
}


