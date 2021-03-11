package com.fxd.user.entityext;

import com.fxd.core.web.SearchCondition;
import com.fxd.user.entity.Dept;

/**
 * @Author zhc
 * @Date 2021/3/4 20:27
 */
public class DeptExt extends SearchCondition {

    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
