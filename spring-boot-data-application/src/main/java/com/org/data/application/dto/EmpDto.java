package com.org.data.application.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmpDto implements Serializable {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private DeptDto department;

    public Integer getId() {
        return id;
    }

    public EmpDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public EmpDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public EmpDto setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public EmpDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public DeptDto getDepartment() {
        return department;
    }

    public EmpDto setDepartment(DeptDto department) {
        this.department = department;
        return this;
    }
}
