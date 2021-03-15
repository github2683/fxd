package com.fxd.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义过虑器
 * @Author zhc
 * @Date 2021/3/15 19:46
 */
@Component
public class DefFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";// route,post,error 共四种
    }

    @Override
    public int filterOrder() {
        return 0;//数字越小顺序越优秀
    }

    /**
     * 是否要执行filter
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过虑器的具体操作
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        System.out.println("token="+token);
        if (token == null){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("没有 Token 信息");
            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
