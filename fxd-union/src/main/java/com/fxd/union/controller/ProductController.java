package com.fxd.union.controller;

import com.fxd.union.feign.FeignUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhc
 * @Date 2021/3/12 16:29
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private FeignUser user;

    @RequestMapping("/test")
    public void test(String param){
        System.out.println(param);
        user.add();
    }
}
