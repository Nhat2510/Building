package com.tuannhat.Identify_service.builder;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class BuildingSearchBuilder {
    String name;
    String street;
    String ward;
    Long districtid;
    Long rentprice;
    Long numberofbasement;
    Long floorarea;
    String managername;
    String managerphonenumber;
    String servicefee;
    List<String> typeCode = new ArrayList<>();

    private BuildingSearchBuilder(Builder builder){
        this.name=builder.name;
        this.street = builder.street;
        this.ward = builder.ward;
        this.districtid = builder.districtid;
        this.rentprice = builder.rentprice;
        this.numberofbasement = builder.numberofbasement;
        this.floorarea = builder.floorarea;
        this.managername = builder.managername;
        this.managerphonenumber = builder.managerphonenumber;
        this.servicefee = builder.servicefee;
        this.typeCode = builder.typeCode;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getWard() {
        return ward;
    }

    public Long getRentprice() {
        return rentprice;
    }

    public Long getDistrictid() {
        return districtid;
    }

    public Long getNumberofbasement() {
        return numberofbasement;
    }

    public Long getFloorarea() {
        return floorarea;
    }

    public String getManagername() {
        return managername;
    }

    public String getManagerphonenumber() {
        return managerphonenumber;
    }

    public String getServicefee() {
        return servicefee;
    }

    public List<String> getTypeCode() {
        return typeCode;
    }

    public static class Builder{
        String name;
        String street;
        String ward;
        Long districtid;
        Long rentprice;
        Long numberofbasement;
        Long floorarea;
        String managername;
        String managerphonenumber;
        String servicefee;
        List<String> typeCode = new ArrayList<>();

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setWard(String ward) {
            this.ward = ward;
            return this;
        }

        public Builder setDistrictid(Long districtid) {
            this.districtid = districtid;
            return this;
        }

        public Builder setRentprice(Long rentprice) {
            this.rentprice = rentprice;
            return this;
        }

        public Builder setNumberofbasement(Long numberofbasement) {
            this.numberofbasement = numberofbasement;
            return this;
        }

        public Builder setFloorarea(Long floorarea) {
            this.floorarea = floorarea;
            return this;
        }

        public Builder setManagername(String managername) {
            this.managername = managername;
            return this;
        }

        public Builder setManagerphonenumber(String managerphonenumber) {
            this.managerphonenumber = managerphonenumber;
            return this;
        }

        public Builder setServicefee(String servicefee) {
            this.servicefee = servicefee;
            return this;
        }

        public Builder setTypeCode(List<String> typeCode) {
            this.typeCode = typeCode;
            return this;
        }

        public BuildingSearchBuilder build(){
            return new BuildingSearchBuilder(this);
        }
    }
}
