package com.org.data.application.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ItemTypeIssuesXrefId implements Serializable {
    private ItemType itemType;
    private ItemIssues itemIssues;

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public ItemIssues getItemIssues() {
        return itemIssues;
    }

    public void setItemIssues(ItemIssues itemIssues) {
        this.itemIssues = itemIssues;
    }
}
