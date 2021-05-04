package com.org.data.application.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item_inspection_method")
public class ItemInspectionMethod implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String desc;

    @ManyToOne
    private ItemType itemType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
