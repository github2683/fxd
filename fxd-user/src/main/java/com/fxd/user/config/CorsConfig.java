package com.fxd.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CORS跨域处理配置
 * @Author zhc
 * @Date 2021/3/6 14:04
 */
//@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        /**
         * 允许访问的路径
         * 允许跨域访问的源
         * 允许请求方法
         * 预检间隔时间
         * 允许头部设置
         * 是否发送cookie
         */
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST","GET")
                .maxAge(168000)
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
