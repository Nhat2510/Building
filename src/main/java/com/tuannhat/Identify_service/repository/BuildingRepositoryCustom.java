package com.tuannhat.Identify_service.repository;

import com.tuannhat.Identify_service.builder.BuildingSearchBuilder;
import com.tuannhat.Identify_service.entity.Building;

import java.util.List;

public interface BuildingRepositoryCustom {
    List<Building> searchBuildings(BuildingSearchBuilder buildingSearchBuilder);

}
