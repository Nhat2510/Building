package com.tuannhat.Identify_service.controller;

import com.tuannhat.Identify_service.entity.Building;
import com.tuannhat.Identify_service.model.BuildingRequest.BuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.CreateBuildingDTO;
import com.tuannhat.Identify_service.model.BuildingRequest.UpdateBuildingDTO;
import com.tuannhat.Identify_service.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/building")
public class BuildingAPI
{
    @Autowired
    private BuildingService buildingService;

    @GetMapping
    public List<BuildingDTO> getBuilding(){
        return buildingService.getBuilding();
    }

//    @GetMapping("/allBuilding")
//    public List<BuildingDTO> findAll(@RequestParam Map<String,Object> params,@RequestParam(name="typeCode",required = false) List<String> typeCode){
//        return null;
//    }

    @GetMapping("/{id}")
    public Building getOneBuilding(@PathVariable String id){
        return buildingService.getBuildingById(id);
    }

    @PostMapping
    public Building createBuilding(@RequestBody CreateBuildingDTO request){
        return buildingService.createBuilding(request);
    }

    @PutMapping("/{id}")
    public Building updateBuilding(@PathVariable String id, @RequestBody UpdateBuildingDTO request){
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
