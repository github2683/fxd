package com.fxd.user.service;

import com.fxd.core.service.BaseService;
import com.fxd.user.entity.User;
import com.fxd.user.entityext.UserExt;

import java.util.Set;

/**
 * @Author zhc
 * @Date 2021/3/4 18:42
 */
public interface UserService extends BaseService<User, UserExt> {
    User findByName(String username);
    /**
     * 查找用户的菜单权限标识集合
     * @param userName
     * @return
     */
    Set<String> findPermissions(String userName);
}
