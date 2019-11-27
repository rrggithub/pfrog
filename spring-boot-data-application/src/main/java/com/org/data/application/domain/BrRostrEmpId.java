package com.org.data.application.domain;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
@Embeddable
public class BrRostrEmpId implements Serializable {
    private BrRostr brRostr;
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
