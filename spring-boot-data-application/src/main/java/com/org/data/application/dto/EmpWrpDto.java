package com.org.data.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class EmpWrpDto implements Serializable {
    private List<EmpDto> empDtos;

    public List<EmpDto> getEmpDtos() {
        return empDtos;
    }

    public void setEmpDtos(List<EmpDto> empDtos) {
        this.empDtos = empDtos;
    }
}
