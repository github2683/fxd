package com.fxd.core.controller;

import com.fxd.core.entity.BaseEntity;
import com.fxd.core.service.BaseService;
import com.fxd.core.web.Constants;
import com.fxd.core.web.ResponseResult;
import com.fxd.core.web.SearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhc
 * @Date 2021/3/4 19:33
 */
@RestController
public class BaseController<T extends BaseEntity,S extends SearchCondition> {

    @Autowired
    private BaseService<T,S> baseService;

    private ResponseResult result = new ResponseResult();

    @RequestMapping("/add")
    public ResponseResult add(T t){
        String id = baseService.add(t);
        result.setResult(id);
        return result;
    }

    @RequestMapping("/delete")
    public ResponseResult delete(String id){
        Integer rows = baseService.delete(id);
        if(rows == null || rows < 1) {
            result.setCode(Constants.CODE_FAIL);
            result.setMsg(Constants.MSG_FIAL);
        }

        return result;
    }

    @RequestMapping("/update")
    public ResponseResult update(T t){
        Integer rows = baseService.update(t);
        if(rows == null || rows < 1) {
            result.setCode(Constants.CODE_FAIL);
            result.setMsg(Constants.MSG_FIAL);
        }
        return result;
    }

    @RequestMapping("/getById")
    public ResponseResult getById(String id){
        T t = baseService.getById(id);
        if(t == null) {
            result.setCode(Constants.CODE_NODATA);
            result.setMsg(Constants.MSG_NODATA);
        }else {
            result.setResult(t);
        }
        return result;
    }

    @RequestMapping("/search")
    public ResponseResult search(S s){
        ResponseResult responseResult = baseService.search(s);
        return responseResult;
    }
}
