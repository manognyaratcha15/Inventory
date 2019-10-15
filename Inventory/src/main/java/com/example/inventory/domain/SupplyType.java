package com.example.inventory.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class SupplyType
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String supplyTypeId;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "supplyType")
    @JsonIgnore
    private Set<Inventory> inventories;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSupplyTypeId() {
        return supplyTypeId;
    }

    public void setSupplyTypeId(String supplyTypeId) {
        this.supplyTypeId = supplyTypeId;
    }


    public Set<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }
}
