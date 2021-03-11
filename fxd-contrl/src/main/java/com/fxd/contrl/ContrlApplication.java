package com.fxd.contrl;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zhc
 * @Date 2021/3/11 18:37
 */
@EnableAdminServer
@SpringBootApplication
public class ContrlApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContrlApplication.class,args);
    }
}
