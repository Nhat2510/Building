package com.tuannhat.Identify_service.model.BuildingRequest;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BuildingDTO {
     Long id;
     String name;
     String address;
     Long districtid;
     Long rentprice;
     Long numberofbasement;
     Long floorarea;
     String managername;
     String managerphonenumber;
     String servicefee;
     Long brokeragefee;
}
