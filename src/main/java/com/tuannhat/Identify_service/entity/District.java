package com.tuannhat.Identify_service.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "code")
    String code;

    @Column(name="name")
    String name;

    @OneToMany(mappedBy = "district",fetch = FetchType.LAZY)
    List<Building> items=new ArrayList<>();

}
