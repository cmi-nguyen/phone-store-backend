package com.main.phone_store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "billdetail")
public class BillDetail {
    @Id
    @Column(name = "bill_ID")
    private Integer billID;

    public Integer getBillID() {
        return billID;
    }

    public void setBillID(Integer billID) {
        this.billID = billID;
    }
    @Column(name = "product_ID")
    private Integer product_ID;

    public Integer getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(Integer product_ID) {
        this.product_ID = product_ID;
    }
    @Column(name = "quantity")
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
