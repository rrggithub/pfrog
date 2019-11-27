package com.org.data.application.controller;

import com.org.data.application.dto.BrRostrDto;
import com.org.data.application.dto.DeptDto;
import com.org.data.application.dto.EmpDto;
import com.org.data.application.repository.BrRostrRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BrRostrController {
    private BrRostrRepo brRostrRepo;

    private BrRostrController(BrRostrRepo brRostrRepo) {
        this.brRostrRepo = brRostrRepo;
    }

    @GetMapping("/brRostr/employees")
    List<BrRostrDto> getRostrEmps() {
        return brRostrRepo.findAll().stream()
                .map(
                        brRostr ->
                                new BrRostrDto()
                                        .setAffirm(brRostr.isAffirm())
                                        .setAffirmDate(brRostr.getAffirmDate())
                                        .setId(brRostr.getId())
                                        .setEmployees(brRostr.getBrRostrEmps().stream()
                                                .map(
                                                        brRostrEmp ->
                                                                new EmpDto()
                                                                        .setId(brRostrEmp.getEmp().getId())
                                                                        .setFirstName(
                                                                                brRostrEmp.getEmp().getFirstName())
                                                                        .setDepartment(new DeptDto()
                                                                                .setId(
                                                                                        brRostrEmp
                                                                                                .getEmp()
                                                                                                .getDept().getId())
                                                                                .setName(
                                                                                        brRostrEmp
                                                                                                .getEmp()
                                                                                                .getDept()
                                                                                                .getName())))
                                                .collect(Collectors.toList()))
                )
                .collect(Collectors.toList());
    }
}
