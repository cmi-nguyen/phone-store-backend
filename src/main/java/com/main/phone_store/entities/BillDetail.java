package com.main.phone_store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Cleanup;

@Entity
@Table(name ="billdetail")
public class BillDetail {
    // BillDetail: bill_ID, product_ID, quantity
    @Id
    @Column(name="billDetail_ID")
    private Integer billDetailID;

    public Integer getBillDetailID() {
        return billDetailID;
    }

    public void setBillDetailID(Integer billDetailID) {
        this.billDetailID = billDetailID;
    }

    @Column(name = "bill_ID")
    private Integer billID;
    public Integer getBillID() {
        return billID;
    }

    public void setBillID(Integer billID) {
        this.billID = billID;
    }

    @Column(name = "product_ID")
    private Integer productID;
    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
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
