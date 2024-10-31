package com.tuannhat.Identify_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "assignmentbuilding")
public class AssignmentBuilding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long staffid;
    private long buildingid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStaffid() {
        return staffid;
    }

    public void setStaffid(long staffid) {
        this.staffid = staffid;
    }

    public long getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(long buildingid) {
        this.buildingid = buildingid;
    }

}
