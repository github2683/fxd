package com.fxd.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author zhc
 * @Date 2021/3/16 18:25
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class FxdConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(FxdConfigApplication.class,args);
    }
}
