package com.fxd.user.service.impl;

import com.fxd.core.service.BaseServiceImpl;
import com.fxd.user.dao.DictDao;
import com.fxd.user.entity.Dict;
import com.fxd.user.entityext.DictExt;
import com.fxd.user.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhc
 * @Date 2021/3/10 11:05
 */
@Service
public class DictServiceImpl extends BaseServiceImpl<Dict, DictExt> implements DictService {

    @Autowired
    private DictDao dictDao;




}
