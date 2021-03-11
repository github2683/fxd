package com.fxd.user.entityext;

import com.fxd.core.web.SearchCondition;
import com.fxd.user.entity.User;

/**
 * @Author zhc
 * @Date 2021/3/4 20:25
 */
public class UserExt extends SearchCondition {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
