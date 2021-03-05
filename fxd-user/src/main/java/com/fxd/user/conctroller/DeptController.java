package com.fxd.user.conctroller;

import com.fxd.core.controller.BaseController;
import com.fxd.user.entity.Dept;
import com.fxd.user.entityext.DeptExt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhc
 * @Date 2021/3/4 20:51
 */
@RestController
@RequestMapping("/dept")
public class DeptController extends BaseController<Dept, DeptExt> {
}
