package com.fxd.core.service;

import com.fxd.core.entity.BaseEntity;
import com.fxd.core.web.ResponseResult;
import com.fxd.core.web.SearchCondition;

/**
 * 基本CRUD的接口
 * @Author zhc
 * @Date 2021/3/3 23:18
 */
public interface BaseService<T extends BaseEntity,S extends SearchCondition> {
    String add(T t);
    Integer delete(String id);
    Integer update(T t);
    T getById(String id);
    ResponseResult search(S s);

}
