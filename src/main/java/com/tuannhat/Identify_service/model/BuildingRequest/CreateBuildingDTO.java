package com.tuannhat.Identify_service.model.BuildingRequest;

public class CreateBuildingDTO {
    private String name;
    private String street;
    private String ward;
    private long districtid;
    private int rentprice;

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

    public long getDistrictid() {
        return districtid;
    }

    public void setDistrictid(long districtid) {
        this.districtid = districtid;
    }

    public int getRentprice() {
        return rentprice;
    }

    public void setRentprice(int rentprice) {
        this.rentprice = rentprice;
    }
}
