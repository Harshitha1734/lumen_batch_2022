package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="lumen_mobile_plans")
public class MobilePlan {
	
	
	@Id
	@Column(name="plan_id")
	int planId;
	@Column(name="plan_name")
	String planName;
	double cost;
	String validity;

}
