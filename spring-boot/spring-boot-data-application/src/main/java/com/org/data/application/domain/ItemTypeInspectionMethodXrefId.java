package com.org.data.application.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ItemTypeInspectionMethodXrefId implements Serializable {
    private ItemType itemType;
    private ItemInspectionMethod itemInspectionMethod;

    public ItemInspectionMethod getItemInspectionMethod() {
        return itemInspectionMethod;
    }

    public void setItemInspectionMethod(ItemInspectionMethod itemInspectionMethod) {
        this.itemInspectionMethod = itemInspectionMethod;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
