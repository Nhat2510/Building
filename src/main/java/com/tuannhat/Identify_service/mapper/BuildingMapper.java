package com.tuannhat.Identify_service.mapper;

import com.tuannhat.Identify_service.entity.Building;
import com.tuannhat.Identify_service.model.BuildingRequest.BuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.CreateBuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.UpdateBuildingDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring") // Đảm bảo annotation này có componentModel = "spring"
public interface BuildingMapper {
    Building toBuilding(CreateBuildingDTO request);
    void updateBuilding(@MappingTarget Building building, UpdateBuildingDTO request);

    @Mapping(target = "address", expression = "java(building.getStreet() + \",\" + building.getWard())")
    BuildingDTO toBuildingDTO(Building building);
}
