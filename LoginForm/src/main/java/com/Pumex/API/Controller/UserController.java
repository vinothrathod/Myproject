package com.Pumex.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.Pumex.API.Entity.User;

import com.Pumex.API.Repository.UserRepository;

@CrossOrigin("*")
@RestController
public class UserController {

	@Autowired
	UserRepository repo;
	
	
	
	@GetMapping("/user/list")
	public List<User> getAllUsers(){
		
		List<User>user=repo.findAll();
		
		return user;
		
	}
	
	
	@GetMapping("/user/list/{id}")
	public User getUser(@PathVariable int id) {
		User user=repo.findById(id).get();
		
		return user;
	}
	
	
	@PostMapping("/user/add")
//	@ResponseStatus(code=HttpStatus.CREATED) 
	public User createUser(@RequestBody User user) {
		//TODO: process POST request
		
		return repo.save(user);
		
	}
	
	
	@PutMapping("/user/update/{id}")
	public User updateUser(@PathVariable int id ) {
		//TODO: process PUT request
		User user=repo.findById(id).get();
		user.setName("Ram");
		user.setEmail("ram123@gmail.com");
		user.setCourses("BSC");
		
		repo.save(user);
		
		return user;
	}
	

	
	
	@DeleteMapping("/user/delete/{id}")
	public void removeUser(@PathVariable int id) {
		User user = repo.findById(id).get();
		
		repo.delete(user);
		
//		return "delete";
	}
		
	
	
}



