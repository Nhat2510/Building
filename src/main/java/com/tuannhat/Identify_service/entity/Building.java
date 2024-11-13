package com.tuannhat.Identify_service.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "building")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "street")
    String street;

    @Column(name = "ward")
    String ward;

    @Column(name = "districtid")
    Long districtid;

    @Column(name = "rentprice")
    Long rentprice;

    @Column(name = "numberofbasement")
    Long numberofbasement;

    @Column(name = "floorarea")
    Long floorarea;

    @Column(name = "managername")
    String managername;

    @Column(name = "managerphonenumber")
    String managerphonenumber;

    @Column(name = "servicefee")
    String servicefee;

    @ManyToOne
    @JoinColumn(name = "districtid")
    District district;

}
