package com.ruoyi.project.system.domain.thinkman;

import java.util.Date;

public class Test {
    private long id;
    private String name;
    private Date create_time;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreate_time() {
        return create_time;
    }
}
