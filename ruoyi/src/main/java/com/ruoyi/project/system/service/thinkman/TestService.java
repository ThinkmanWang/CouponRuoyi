package com.ruoyi.project.system.service.thinkman;

import com.ruoyi.project.system.domain.thinkman.Test;
import com.ruoyi.project.system.mapper.thinkman.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    public List<Test> getAll() {
        return testMapper.getAll();
    }
}
