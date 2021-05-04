package com.org.data.application.controller;

import com.org.data.application.domain.Emp;
import com.org.data.application.dto.EmpDto;
import com.org.data.application.dto.EmpWrpDto;
import com.org.data.application.repository.EmpRepo;
import com.org.data.application.transformers.EmpConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class EmployeeController {
    private EmpRepo empRepo;

    @Autowired
    private EmployeeController(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @GetMapping("/employees")
    EmpWrpDto getAllEmp() {
       // List<Object[]> rows = empRepo.findAllUsingJDBCStyle();
        //empRepo.save(new Emp());
        //return EmpConverter.convertToEmpDtoUsingJDBCStyle(rows);
        EmpWrpDto empWrpDto = new EmpWrpDto();
        empWrpDto.setEmpDtos(new ArrayList<>());
       empRepo.findAll().forEach(emp -> {
           EmpDto empDto = new EmpDto().setId(emp.getId()).setFirstName(emp.getFirstName());
           empWrpDto.getEmpDtos().add(empDto);
       });

       return empWrpDto;
    }
}
