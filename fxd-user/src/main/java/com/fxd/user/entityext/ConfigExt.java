package com.fxd.user.entityext;

import com.fxd.core.web.SearchCondition;
import com.fxd.user.entity.Config;

/**
 * @Author zhc
 * @Date 2021/3/4 20:26
 */
public class ConfigExt extends SearchCondition {
    private Config config;

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
