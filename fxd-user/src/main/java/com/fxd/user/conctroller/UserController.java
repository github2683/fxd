package com.fxd.user.conctroller;

import com.fxd.core.controller.BaseController;
import com.fxd.user.entity.User;
import com.fxd.user.entityext.UserExt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhc
 * @Date 2021/3/4 20:49
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User, UserExt> {
}
