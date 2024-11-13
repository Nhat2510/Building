package com.tuannhat.Identify_service.model.BuildingRequest;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateBuildingDTO {
     String name;
     String street;
     String ward;
     Long districtid;
     Long rentprice;
}