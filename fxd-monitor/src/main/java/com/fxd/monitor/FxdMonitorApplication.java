package com.fxd.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zhc
 * @Date 2021/3/11 15:23
 */
@SpringBootApplication
@EnableAdminServer
public class FxdMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FxdMonitorApplication.class,args);
    }
}
