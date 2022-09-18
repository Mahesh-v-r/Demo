package com.sj.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.model.Application;

@Repository
public interface ApplicationRepo extends JpaRepository<Application,Integer> {
		
	
	
	 public List<Application> findByStatus(String Status);
	 
	 
}
