package com.fxd.union.feign;

import com.fxd.union.hystrix.FeignUserHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用 用户服务 的对接处理接口，并加上调用失败的熔断处理
 * @Author zhc
 * @Date 2021/3/12 16:17
 */

@FeignClient(name = "fxd-user",fallback = FeignUserHystrix.class)
@RequestMapping("/user")
public interface FeignUser {

    @RequestMapping("/add")
    String add();
}
