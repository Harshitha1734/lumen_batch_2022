package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.MobilePlan;
import com.example.demo.repos.PlanRepository;
import com.training.exceptions.ElementNotFoundException;

@Service
public class MobilePlanService {

	
	private PlanRepository repo;

	@Autowired
	public MobilePlanService(PlanRepository repo) {
		super();
		this.repo = repo;
	}
	public List<MobilePlan> findAll(){
		return this.repo.findAll();
	}
	public MobilePlan add(MobilePlan entity) {
		return this.repo.save(entity);
	}
	public MobilePlan findById(int id) {
		String message=new StringBuilder("Element With Given Id").append(id).append("Not Found").toString();
		return this.repo.findById(id)
				.orElseThrow(()-> new RuntimeException(message));
	}
	public MobilePlan remove(int id) {
	  MobilePlan element= findById(id);
	   this.repo.deleteById(element.getPlanId());
	   return element;
	}
	public void update(MobilePlan entity) {
		    this.repo.save(entity);
		}
    public List<MobilePlan> findByPlanName(String planName){
    	List<MobilePlan> list=this.repo.findByPlanName(planName);
    	return list;
    }
    
   public List<MobilePlan> getCostGrtThan(double amount){
	   return this.repo.getCostGrtThan(amount);
	   
   }
   public int updateValidity(String updatedValidity,String PlanName) {
	   return this.repo.updateValidity(updatedValidity, PlanName);
   }

}
