package com.tuannhat.Identify_service.mapper;

import com.tuannhat.Identify_service.entity.Building;
import com.tuannhat.Identify_service.model.BuildingRequest.BuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.CreateBuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.UpdateBuildingDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-07T20:07:18+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class BuildingMapperImpl implements BuildingMapper {

    @Override
    public Building toBuilding(CreateBuildingDTO request) {
        if ( request == null ) {
            return null;
        }

        Building building = new Building();

        building.setName( request.getName() );
        building.setStreet( request.getStreet() );
        building.setWard( request.getWard() );
        building.setDistrictid( request.getDistrictid() );
        building.setRentprice( request.getRentprice() );

        return building;
    }

    @Override
    public void updateBuilding(Building building, UpdateBuildingDTO request) {
        if ( request == null ) {
            return;
        }

        building.setName( request.getName() );
        building.setStreet( request.getStreet() );
        building.setWard( request.getWard() );
        building.setDistrictid( request.getDistrictid() );
        building.setRentprice( request.getRentprice() );
    }

    @Override
    public BuildingDTO toBuildingDTO(Building building) {
        if ( building == null ) {
            return null;
        }

        BuildingDTO buildingDTO = new BuildingDTO();

        buildingDTO.setId( building.getId() );
        buildingDTO.setName( building.getName() );
        buildingDTO.setDistrictid( building.getDistrictid() );
        buildingDTO.setRentprice( building.getRentprice() );
        buildingDTO.setNumberofbasement( building.getNumberofbasement() );
        buildingDTO.setFloorarea( building.getFloorarea() );
        buildingDTO.setManagername( building.getManagername() );
        buildingDTO.setManagerphonenumber( building.getManagerphonenumber() );
        buildingDTO.setServicefee( building.getServicefee() );

        buildingDTO.setAddress( building.getStreet() + "," + building.getWard() );

        return buildingDTO;
    }
}
