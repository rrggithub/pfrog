package com.org.data.application.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NamedEntityGraph(
        name = "brRostr_brRostrEmps_emp",
        attributeNodes = {
                @NamedAttributeNode( value = "brRostrEmps", subgraph = "emp-subgraph")
        },
        subgraphs = {
                @NamedSubgraph( name = "emp-subgraph", attributeNodes = {
                        @NamedAttributeNode(value = "emp", subgraph = "dept-subgraph")
                }),
                @NamedSubgraph(name = "dept-subgraph", attributeNodes = {
                        @NamedAttributeNode("dept")
                })
        }
)
public class BrRostr implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean isAffirm;

    @Temporal(TemporalType.DATE)
    private Date affirmDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "brRostr")
    private List<BrRostrEmp> brRostrEmps = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAffirmDate() {
        return affirmDate;
    }

    public void setAffirmDate(Date affirmDate) {
        this.affirmDate = affirmDate;
    }

    public boolean isAffirm() {
        return isAffirm;
    }

    public void setAffirm(boolean affirm) {
        isAffirm = affirm;
    }

    public List<BrRostrEmp> getBrRostrEmps() {
        return brRostrEmps;
    }

    public void setBrRostrEmps(List<BrRostrEmp> brRostrEmps) {
        if (null != brRostrEmps) {
            this.brRostrEmps.clear();
            this.brRostrEmps.addAll(brRostrEmps);
        }
    }
}
