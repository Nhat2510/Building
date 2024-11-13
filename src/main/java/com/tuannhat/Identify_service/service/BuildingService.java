package com.tuannhat.Identify_service.service;

import com.tuannhat.Identify_service.builder.BuildingSearchBuilder;
import com.tuannhat.Identify_service.converter.BuildingSearchBuilderConverter;
import com.tuannhat.Identify_service.entity.Building;
import com.tuannhat.Identify_service.mapper.BuildingMapper;
import com.tuannhat.Identify_service.model.BuildingRequest.BuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.CreateBuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.UpdateBuildingDTO;
import com.tuannhat.Identify_service.repository.BuildingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BuildingService {
    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private BuildingMapper buildingMapper;

    @Autowired
    private BuildingSearchBuilderConverter buildingSearchBuilderConverter;

    public Building createBuilding(CreateBuildingDTO request){
        if(buildingRepository.existsByName(request.getName())){
            throw new RuntimeException("User exists");
        }
        Building building=buildingMapper.toBuilding(request);
        return buildingRepository.save(building);
    }

    public Building getBuildingById(String id){
        return buildingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

//    public List<BuildingDTO> findAll(Map<String, Object> params, List<String> typeCode){
//        BuildingSearchBuilder buildingSearchBuilder= buildingSearchBuilderConverter.toBuildingSearchBuilder(params,typeCode);
//        return buildingRepository.findAll().stream()
//                .map(item->buildingMapper.toBuildingDTO(item))
//                .collect(Collectors.toList());
//    }

    public List<BuildingDTO> getBuilding(){
        return buildingRepository.findAll().stream()
                .map(item->buildingMapper.toBuildingDTO(item))
                .collect(Collectors.toList());
    }

    public Building updateBuilding (String id , UpdateBuildingDTO request){
        Building building= getBuildingById(id);
        buildingMapper.updateBuilding(building,request);
        return buildingRepository.save(building);
    }

    public void deleteBuilding(String id){
        buildingRepository.deleteById(id);
    }
}
