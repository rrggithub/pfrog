package com.org.data.application.dto;

import java.io.Serializable;

public class DeptDto implements Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public DeptDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DeptDto setName(String name) {
        this.name = name;
        return this;
    }
}
