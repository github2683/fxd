package com.fxd.core.service;

import com.fxd.core.dao.BaseDao;
import com.fxd.core.entity.BaseEntity;
import com.fxd.core.web.Constants;
import com.fxd.core.web.ResponseResult;
import com.fxd.core.web.SearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 基本CRUD的实现类
 * @Author zhc
 * @Date 2021/3/4 18:54
 */
@Service("baseService")
public class BaseServiceImpl<T extends BaseEntity,S extends SearchCondition> implements BaseService<T,S>{

    @Autowired
    private BaseDao<T,S> dao;

    @Override
    public String add(T t) {
        return dao.add(t);
    }

    @Override
    public Integer delete(String id) {
        return dao.delete(id);
    }

    @Override
    public Integer update(T t) {
        return dao.update(t);
    }

    @Override
    public T getById(String id) {
        return dao.getById(id);
    }

    @Override
    public ResponseResult search(S s) {
        ResponseResult result = new ResponseResult();
        List<T> results = dao.search(s);
        if(results != null && results.size()>0){
            Integer total = dao.searchCount(s);
            result.setTotal(total);
            result.setResult(results);
        }else {
            result.setCode(Constants.CODE_NODATA);
            result.setMsg(Constants.MSG_NODATA);
        }
        return result;
    }


}
