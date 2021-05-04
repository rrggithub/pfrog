package com.org.data.application.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chkl_type_item_type_xref")
@IdClass(ChklTypeItemTypeXrefId.class)
public class ChklTypeItemTypeXref implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "chkl_type_id")
    private ChklType chklType;

    @Id
    @ManyToOne
    @JoinColumn(name = "item_type_id")
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
