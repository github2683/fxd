package com.fxd.user.service.impl;

import com.fxd.core.service.BaseServiceImpl;
import com.fxd.user.dao.MenuDao;
import com.fxd.user.entity.Menu;
import com.fxd.user.entityext.MenuExt;
import com.fxd.user.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhc
 * @Date 2021/3/4 20:36
 */
@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu, MenuExt> implements MenuService {
    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> findByUser(String userName) {
        return menuDao.findByUser(userName);
    }
}
