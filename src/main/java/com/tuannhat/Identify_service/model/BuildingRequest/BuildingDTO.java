package com.tuannhat.Identify_service.model.BuildingRequest;


public class BuildingDTO {
    private long id;
    private String name;
    private String address;
    private long districtid;
    private int rentprice;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


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

}
