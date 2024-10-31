package com.tuannhat.Identify_service.service;

import com.tuannhat.Identify_service.entity.District;
import com.tuannhat.Identify_service.model.DistrictDTO;
import com.tuannhat.Identify_service.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    public List<DistrictDTO> getOneDistrict(String code){
        List<District> districts= districtRepository.findByName(code);
        List<DistrictDTO> result= new ArrayList<>();
        for (District item : districts){
            DistrictDTO districtDTO=new DistrictDTO();
            districtDTO.setId(item.getId());
            districtDTO.setCode(item.getCode());
            districtDTO.setName(item.getName());
            result.add(districtDTO);
        }
        return result;
    }
}
