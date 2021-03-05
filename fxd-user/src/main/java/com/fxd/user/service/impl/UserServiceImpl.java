package com.fxd.user.service.impl;

import com.fxd.core.service.BaseServiceImpl;
import com.fxd.user.entity.User;
import com.fxd.user.entityext.UserExt;
import com.fxd.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author zhc
 * @Date 2021/3/4 20:40
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserExt> implements UserService {
}
