package com.org.data.application.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChklTypeItemTypeXrefId implements Serializable {
    private ChklType chklType;
    private ItemType itemType;

    public ChklType getChklType() {
        return chklType;
    }

    public void setChklType(ChklType chklType) {
        this.chklType = chklType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
