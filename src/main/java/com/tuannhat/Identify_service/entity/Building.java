package com.tuannhat.Identify_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String street;
    private String ward;
    private long districtid;
    private int rentprice;

    public int getRentprice() {
        return rentprice;
    }

    public void setRentprice(int rentprice) {
        this.rentprice = rentprice;
    }

    public long getDistrictid() {
        return districtid;
    }

    public void setDistrictid(long districtid) {
        this.districtid = districtid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
}
