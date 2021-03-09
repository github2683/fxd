package com.fxd.user.service.impl;

import com.fxd.core.service.BaseServiceImpl;
import com.fxd.user.dao.UserDao;
import com.fxd.user.entity.Menu;
import com.fxd.user.entity.User;
import com.fxd.user.entityext.UserExt;
import com.fxd.user.service.MenuService;
import com.fxd.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author zhc
 * @Date 2021/3/4 20:40
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserExt> implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private MenuService menuService;


    @Override
    public User findByName(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String userName) {
        Set<String> perms = new HashSet<>();
        List<Menu> menus = menuService.findByUser(userName);
        for(Menu menu:menus) {
            if(menu.getPerms() != null && !"".equals(menu.getPerms())) {
                perms.add(menu.getPerms());
            }
        }
        return perms;
    }
}
