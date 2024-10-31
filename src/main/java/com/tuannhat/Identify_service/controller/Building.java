package com.tuannhat.Identify_service.controller;

import com.tuannhat.Identify_service.model.BuildingRequest.BuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.CreateBuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.UpdateBuildingDTO;
import com.tuannhat.Identify_service.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/building")
public class Building
{
    @Autowired
    private BuildingService buildingService;

    @GetMapping
    public List<BuildingDTO> getBuilding(){
        return buildingService.getBuilding();
    }

    @GetMapping("/{id}")
    public com.tuannhat.Identify_service.entity.Building getOneBuilding(@PathVariable String id){
        return buildingService.getBuildingById(id);
    }

    @PostMapping
    public com.tuannhat.Identify_service.entity.Building createBuilding(@RequestBody CreateBuildingDTO request){
        return buildingService.createBuilding(request);
    }

    @PutMapping("/{id}")
    public com.tuannhat.Identify_service.entity.Building updateBuilding(@PathVariable String id, @RequestBody UpdateBuildingDTO request){
        return buildingService.updateBuilding(id,request);
    }


//    public void valiDate(BuildingDTO buildingDTO) {
//        if(buildingDTO.getName() == null || buildingDTO.getName().equals("")|| buildingDTO.getAge()==0){
//            throw new FieldRequiredException("Name or Age is Null");
//        }
//    }

    @DeleteMapping("/{id}")
    public String deleteBuilding(@PathVariable String id){
        buildingService.deleteBuilding(id);
        return "Building delete successfully";
    }
}
