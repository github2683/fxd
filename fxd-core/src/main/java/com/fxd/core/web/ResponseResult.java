package com.fxd.core.web;

import org.springframework.context.annotation.Bean;

/**
 * 响应信息类
 * @Author zhc
 * @Date 2021/3/3 23:25
 */
public class ResponseResult extends SearchCondition {
    private Integer code;
    private String msg;
    private Object result;

    public Integer getCode() {
        return code==null?Constants.CODE_SUCCESS:code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg==null?Constants.MSG_SUCCESS:msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
