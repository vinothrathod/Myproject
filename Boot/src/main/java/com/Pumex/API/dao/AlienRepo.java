package com.Pumex.API.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Pumex.API.model.Alien;



//									CrudRepository<Alien, Integer>
public interface AlienRepo extends JpaRepository<Alien, Integer> {
	
	
								
//	-----------all values---------
//	List<Alien> findByTech(String tech);
//	
//	List<Alien> findByAidGreaterThan(int aid);
//	
//	@Query("from Alien where tech=?1 order by aname")
//	List<Alien>	findByTechSorted(String tech);
}
