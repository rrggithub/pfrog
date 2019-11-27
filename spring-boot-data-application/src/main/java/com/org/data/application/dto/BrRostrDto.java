package com.org.data.application.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrRostrDto implements Serializable {
    private Integer id;
    boolean isAffirm;
    private Date affirmDate;
    List<EmpDto> employees = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public BrRostrDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public boolean isAffirm() {
        return isAffirm;
    }

    public BrRostrDto setAffirm(boolean affirm) {
        isAffirm = affirm;
        return this;
    }

    public Date getAffirmDate() {
        return affirmDate;
    }

    public BrRostrDto setAffirmDate(Date affirmDate) {
        this.affirmDate = affirmDate;
        return this;
    }

    public List<EmpDto> getEmployees() {
        return employees == null ? new ArrayList<>() : employees;
    }

    public BrRostrDto setEmployees(List<EmpDto> empDtoList) {
        this.employees = empDtoList;
        return this;
    }
}
