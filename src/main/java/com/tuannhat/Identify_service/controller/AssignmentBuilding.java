package com.tuannhat.Identify_service.controller;

import com.tuannhat.Identify_service.model.AssignmentBuildingDTO;
import com.tuannhat.Identify_service.service.AssignmentBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/assignmentbuilding")
public class AssignmentBuilding {
    @Autowired
    private AssignmentBuildingService assignmentBuildingService;

    @GetMapping
    public List<AssignmentBuildingDTO> getAll(){
        return assignmentBuildingService.getAll();
    }

}
