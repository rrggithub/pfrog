package com.org.data.application.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(ItemTypeInspectionMethodXrefId.class)
public class ItemTypeInspectionMethodXref implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemType itemType;

    @Id
    @ManyToOne
    @JoinColumn(name = "inspection_method_id")
    private ItemInspectionMethod itemInspectionMethod;

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public ItemInspectionMethod getItemInspectionMethod() {
        return itemInspectionMethod;
    }

    public void setItemInspectionMethod(ItemInspectionMethod itemInspectionMethod) {
        this.itemInspectionMethod = itemInspectionMethod;
    }
}
