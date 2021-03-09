package com.fxd.user.dao;

import com.fxd.core.dao.BaseDao;
import com.fxd.user.entity.Menu;
import com.fxd.user.entityext.MenuExt;

import java.util.List;

/**
 * @Author zhc
 * @Date 2021/3/4 20:43
 */
public interface MenuDao  extends BaseDao<Menu, MenuExt> {
    List<Menu> findByUser(String userName);
}
