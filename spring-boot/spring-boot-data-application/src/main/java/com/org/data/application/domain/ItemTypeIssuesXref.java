package com.org.data.application.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="item_type_issues_xref")
@IdClass(ItemTypeIssuesXrefId.class)
public class ItemTypeIssuesXref implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemType itemType;

    @Id
    @ManyToOne
    @JoinColumn(name = "item_issue_id")
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
