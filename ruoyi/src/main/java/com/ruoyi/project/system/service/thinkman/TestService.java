package com.ruoyi.project.system.service.thinkman;

import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import com.ruoyi.project.system.domain.SysRole;
import com.ruoyi.project.system.domain.thinkman.Test;
import com.ruoyi.project.system.mapper.SysRoleMapper;
import com.ruoyi.project.system.mapper.thinkman.TestMapper;
import com.ruoyi.project.system.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    @Autowired
    private SysRoleMapper roleMapper;

    @Autowired
    private ISysRoleService roleService;

    public List<Test> getAll() {
        List<Test> lstTest = testMapper.getAll();
        return lstTest;
    }
}
