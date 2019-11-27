package com.org.data.application.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "br_rostr_emp")
@IdClass(BrRostrEmpId.class)
public class BrRostrEmp implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "br_id" , referencedColumnName = "id")
    private BrRostr brRostr;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", referencedColumnName = "id")
    private Emp emp;

    public BrRostr getBrRostr() {
        return brRostr;
    }

    public void setBrRostr(BrRostr brRostr) {
        this.brRostr = brRostr;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
}
