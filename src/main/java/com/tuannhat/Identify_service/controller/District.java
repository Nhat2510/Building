package com.tuannhat.Identify_service.controller;

import com.tuannhat.Identify_service.model.DistrictDTO;
import com.tuannhat.Identify_service.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/district")
public class District {
    @Autowired
    private DistrictService districtService;

    @GetMapping
    public List<DistrictDTO> getByName(@RequestParam (name="code") String code){
        return districtService.getOneDistrict(code);
    }
}
