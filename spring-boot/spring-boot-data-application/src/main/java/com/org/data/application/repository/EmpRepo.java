package com.org.data.application.repository;

import com.org.data.application.dto.EmpDto;
import com.org.data.application.domain.Emp;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpRepo extends JpaRepository<Emp, String> {

    @Query("select e.id, e.firstName, e.middleName, e.lastName, br.isAffirm, br.affirmDate from Dept d " +
            "inner join Emp e on d.id = e.id inner join BrRostrEmp bre on e.id = bre.emp.id inner join BrRostr br " +
            "on br.id = bre.brRostr.id")
    List<Object[]> findAllUsingJDBCStyle();

    @Override
    @EntityGraph(attributePaths = {"dept"})
    List<Emp> findAll();
}
