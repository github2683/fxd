package com.fxd.user.conctroller;

import com.fxd.core.controller.BaseController;
import com.fxd.user.entity.Config;
import com.fxd.user.entityext.ConfigExt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhc
 * @Date 2021/3/4 20:53
 */
@RestController
@RequestMapping("/config")
public class ConfigContrller extends BaseController<Config, ConfigExt> {

}
