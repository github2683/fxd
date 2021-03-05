package com.fxd.user.conctroller;

import com.fxd.core.controller.BaseController;
import com.fxd.user.entity.Role;
import com.fxd.user.entityext.RoleExt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhc
 * @Date 2021/3/4 20:50
 */
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController<Role, RoleExt> {
}
