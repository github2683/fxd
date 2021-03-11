package com.fxd.user.entityext;

import com.fxd.core.web.SearchCondition;
import com.fxd.user.entity.Menu;

/**
 * @Author zhc
 * @Date 2021/3/4 20:27
 */
public class MenuExt extends SearchCondition {

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
