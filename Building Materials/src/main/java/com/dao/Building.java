package com.dao;

import java.util.List;

public class Building {
    private Integer id;
    private String bid;
    private String bname;
    private Integer price;
    private String supplier;
    private Integer bnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getBnumber() {
        return bnumber;
    }

    public void setBnumber(Integer bnumber) {
        this.bnumber = bnumber;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", bid='" + bid + '\'' +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", supplier='" + supplier + '\'' +
                ", bnumber=" + bnumber +
                '}';
    }
}
