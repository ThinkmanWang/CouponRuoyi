package com.ruoyi.project.system.controller;

import com.ruoyi.framework.aspectj.lang.annotation.ThinkDataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.domain.SysRole;
import com.ruoyi.project.system.domain.SysUser;
import com.ruoyi.project.system.domain.thinkman.Test;
import com.ruoyi.project.system.service.ISysRoleService;
import com.ruoyi.project.system.service.thinkman.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class ThinkTestController extends BaseController {

    @Autowired
    TestService testService;

    @Autowired
    private ISysRoleService roleService;

    @GetMapping("/db_test1")
    public AjaxResult test1()
    {
        List<Test> list = testService.getAll();

        List<SysRole> lstRole = roleService.selectRoleAll();
        return AjaxResult.success(list);
    }
}
