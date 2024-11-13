package com.tuannhat.Identify_service.converter;

import com.tuannhat.Identify_service.builder.BuildingSearchBuilder;
import com.tuannhat.Identify_service.utils.MapUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class BuildingSearchBuilderConverter {
    public BuildingSearchBuilder toBuildingSearchBuilder(Map<String, Object> params, List<String> typeCode){

        BuildingSearchBuilder buildingSearchBuilder= new BuildingSearchBuilder.Builder()
                                        .setName(MapUtils.getObject(params,"name",String.class))
                                        .setFloorarea(MapUtils.getObject(params,"floorarea",Long.class))
                                        .setWard(MapUtils.getObject(params,"ward",String.class))
                                        .setStreet(MapUtils.getObject(params,"street",String.class))
                                        .setDistrictid(MapUtils.getObject(params,"districtid",Long.class))
                                        .setNumberofbasement(MapUtils.getObject(params,"numberofbasement",Long.class))
                                        .setManagername(MapUtils.getObject(params,"managername",String.class))
                                        .setManagerphonenumber(MapUtils.getObject(params,"managerphonenumber",String.class))
                                        .setServicefee(MapUtils.getObject(params,"servicefee",String.class))
                                        .setRentprice(MapUtils.getObject(params,"floorarea",Long.class))
                                        .setTypeCode(typeCode)
                                        .build();
        return buildingSearchBuilder;
    };

}
