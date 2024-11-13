package com.tuannhat.Identify_service.repository;

import com.tuannhat.Identify_service.builder.BuildingSearchBuilder;
import com.tuannhat.Identify_service.entity.Building;
import com.tuannhat.Identify_service.model.BuildingRequest.BuildingDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building, String> {
    boolean existsByName(String name);
}
