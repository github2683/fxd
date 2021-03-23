package com.fxd.union;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @Author zhc
 * @Date 2021/3/12 16:03
 */
@EnableFeignClients
@SpringBootApplication
public class FxdUnionApplication {
    public static void main(String[] args) {
        SpringApplication.run(FxdUnionApplication.class,args);
    }
}
