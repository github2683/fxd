package com.fxd.user.entityext;

import com.fxd.core.web.SearchCondition;
import com.fxd.user.entity.Dict;

/**
 * @Author zhc
 * @Date 2021/3/10 10:34
 */
public class DictExt extends SearchCondition {
    private Dict dict;

    public Dict getDict() {
        return dict;
    }

    public void setDict(Dict dict) {
        this.dict = dict;
    }
}
