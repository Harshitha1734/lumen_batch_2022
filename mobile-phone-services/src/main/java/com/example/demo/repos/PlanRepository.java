package com.example.demo.repos;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.MobilePlan;

public interface PlanRepository extends JpaRepository<MobilePlan, Integer> {
	
	
	
	List<MobilePlan> findByPlanName(String planName);
	
	
	@Query(value="select * from lumen_mobile_plans where cost>:srchAmount",nativeQuery = true)
	List<MobilePlan> getCostGrtThan(@Param("srchAmount") double amount);

	@Query(nativeQuery = false,value="update MobilePlan set validity=:newValue where planName=:pname")
	@Modifying
	@Transactional
	int updateValidity(@Param("newValue") String updatedValidity,@Param("pname") String planName);
}
