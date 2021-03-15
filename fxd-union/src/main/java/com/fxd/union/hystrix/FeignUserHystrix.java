package com.fxd.union.hystrix;

import com.fxd.union.feign.FeignUser;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用 用户服务 的熔断器
 * @Author zhc
 * @Date 2021/3/12 16:19
 */
@Component
public class FeignUserHystrix implements FeignUser {

    @RequestMapping("/user/add")
    @Override
    public String add() {
        return "增加用户调用出错熔断";
    }
}
