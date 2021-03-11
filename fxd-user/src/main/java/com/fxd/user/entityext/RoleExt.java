package com.fxd.user.entityext;

import com.fxd.core.web.SearchCondition;
import com.fxd.user.entity.Role;

/**
 * @Author zhc
 * @Date 2021/3/4 20:26
 */
public class RoleExt extends SearchCondition {

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
