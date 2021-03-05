package com.fxd.user.service.impl;

import com.fxd.core.service.BaseServiceImpl;
import com.fxd.user.entity.Config;
import com.fxd.user.entityext.ConfigExt;
import com.fxd.user.service.ConfigService;
import org.springframework.stereotype.Service;

/**
 * @Author zhc
 * @Date 2021/3/4 20:34
 */
@Service
public class ConfigServiceImpl extends BaseServiceImpl<Config, ConfigExt> implements ConfigService {
}
