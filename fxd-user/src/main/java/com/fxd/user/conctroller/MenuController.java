package com.fxd.user.conctroller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.fxd.core.controller.BaseController;
import com.fxd.user.entity.Menu;
import com.fxd.user.entityext.MenuExt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhc
 * @Date 2021/3/4 20:52
 */
@RestController
@RequestMapping("/menu")
public class MenuController extends BaseController<Menu, MenuExt> {
}
