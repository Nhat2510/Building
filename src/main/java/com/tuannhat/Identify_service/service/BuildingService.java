package com.tuannhat.Identify_service.service;

import com.tuannhat.Identify_service.entity.Building;
import com.tuannhat.Identify_service.model.BuildingRequest.BuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.CreateBuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.UpdateBuildingDTO;
import com.tuannhat.Identify_service.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;

    public Building createBuilding(CreateBuildingDTO request){
        Building building=new Building();
        building.setName(request.getName());
        building.setRentprice(request.getRentprice());
        building.setDistrictid(request.getDistrictid());
        building.setStreet(request.getStreet());
        building.setWard(request.getWard());
        return buildingRepository.save(building);
    }


    public List<BuildingDTO> getBuilding(){
        List<Building> buildings= buildingRepository.findAll();
        List<BuildingDTO> result = new ArrayList<>();
        for (Building item : buildings){
            BuildingDTO buildingDTO=new BuildingDTO();
            buildingDTO.setId(item.getId());
            buildingDTO.setName(item.getName());
            buildingDTO.setAddress(item.getStreet()+","+item.getWard());
            buildingDTO.setDistrictid(item.getDistrictid());
            buildingDTO.setRentprice(item.getRentprice());
            result.add(buildingDTO);
        }
        return result;
    }

    public Building getBuildingById(String id){
        return buildingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public Building updateBuilding (String id ,UpdateBuildingDTO request){
        Building building= getBuildingById(id);
        building.setName(request.getName());
        building.setWard(request.getWard());
        building.setStreet(request.getStreet());
        building.setDistrictid(request.getDistrictid());
        building.setRentprice(request.getRentprice());

        return buildingRepository.save(building);
    }

    public void deleteBuilding(String id){
        buildingRepository.deleteById(id);
    }
}
