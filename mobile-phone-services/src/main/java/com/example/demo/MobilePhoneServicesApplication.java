package com.example.demo;

import org.hibernate.annotations.JoinFormula;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.MobilePlan;
import com.example.demo.repos.PlanRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Mobile Plan Manager"))
public class MobilePhoneServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilePhoneServicesApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
            PlanRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				repo.save(new MobilePlan(102,"PRE-PAID",120,"28 days"));
				
			}
		};
	}
}
			
