package com.fxd.core.dao;

import com.fxd.core.entity.BaseEntity;
import com.fxd.core.web.SearchCondition;

import java.util.List;

/**
 * 基本CRUD的DAO接口
 * @Author zhc
 * @Date 2021/3/3 23:18
 */
public interface BaseDao<T extends BaseEntity,S extends SearchCondition> {
    String add(T t);
    Integer delete(String id);
    Integer update(T t);
    T getById(String id);
    List<T> search(S s);
    Integer searchCount(S s);

}
