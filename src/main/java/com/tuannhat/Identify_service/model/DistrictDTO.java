package com.tuannhat.Identify_service.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DistrictDTO {
     Long id;
     String code;
     String name;
}
