package com.example.inventory.domain;

import javax.persistence.*;

@Entity
public class SupplyData
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @Column(unique = true)
    private String itemId;
    private Integer quantity;
    private String quantityAdjustmentType;
    @ManyToOne(cascade = CascadeType.MERGE)

    private Location location;
    @ManyToOne(cascade = CascadeType.MERGE)

    private SupplyType supplyType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getQuantityAdjustmentType() {
        return quantityAdjustmentType;
    }

    public void setQuantityAdjustmentType(String quantityAdjustmentType) {
        this.quantityAdjustmentType = quantityAdjustmentType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public SupplyType getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(SupplyType supplyType) {
        this.supplyType = supplyType;
    }
}
