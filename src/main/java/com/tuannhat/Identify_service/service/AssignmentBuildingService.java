package com.tuannhat.Identify_service.service;

import com.tuannhat.Identify_service.entity.AssignmentBuilding;
import com.tuannhat.Identify_service.model.AssignmentBuildingDTO;
import com.tuannhat.Identify_service.repository.AssignmentBuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignmentBuildingService {
    @Autowired
    private AssignmentBuildingRepository assignmentBuildingRepository;

    public List<AssignmentBuildingDTO> getAll(){
        List<AssignmentBuilding> assignmentBuildings = assignmentBuildingRepository.findAll();
        List<AssignmentBuildingDTO> result= new ArrayList<>();
        for(AssignmentBuilding item : assignmentBuildings){
            AssignmentBuildingDTO assignmentBuildingDTO = new AssignmentBuildingDTO();
            assignmentBuildingDTO.setId(item.getId());
            assignmentBuildingDTO.setBuildingid(item.getBuildingid());
            assignmentBuildingDTO.setStaffid(item.getStaffid());
            result.add(assignmentBuildingDTO);
        }
        return result;
    }
}
