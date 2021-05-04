package com.org.data.application.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item_type")
public class ItemType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String desc;
    @OneToOne
    private ItemCategory itemCategory;

    @OneToMany(mappedBy = "itemType")
    private List<ItemTypeIssuesXref> itemIssues = new ArrayList<>();

    @OneToMany(mappedBy = "itemType")
    private List<ItemTypeInspectionMethodXref> itemTypeInspectionMethodXrefs = new ArrayList<>();

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

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }
}
