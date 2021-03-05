package com.fxd.user;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zhc
 * @Date 2021/3/2 19:21
 */
@SpringBootApplication
@MapperScan("com.fxd.user.dao")
public class FxdUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(FxdUserApplication.class,args);
    }

}
