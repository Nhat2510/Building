package com.tuannhat.Identify_service.repository;

import com.tuannhat.Identify_service.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,String> {

    @Query("select b from District b where b.code = :code")
    List<District> findByName(@Param("code") String code);
}
