package com.org.data.application.repository;

import com.org.data.application.domain.BrRostr;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrRostrRepo extends JpaRepository<BrRostr, Integer> {

    @Override
    @EntityGraph(value = "brRostr_brRostrEmps_emp")
    List<BrRostr> findAll();
}