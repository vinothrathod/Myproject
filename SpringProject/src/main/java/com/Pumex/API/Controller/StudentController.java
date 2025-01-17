package com.Pumex.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Pumex.API.Entity.Student;
import com.Pumex.API.Repository.StudentRepository;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin("*")

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	
		/*-------- get all the students---------------*/
	
	
//	localhost:8080/students
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		List<Student>students=repo.findAll();
		
		return students;
		
	}
	
	/* -----GET  method------*/
	
	/*-------Read the data---------*/
	
	
//	localhost:8080/students/101
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student=repo.findById(id).get();
		
		return student;
	}
	
	
	
	/*----------CREATE the  new data------------*/
	
	/* -------postmapping is create in new data-------*/
	
//	localhost:8080/students/add for the new student data
	
	@PostMapping("/students/add")
	@ResponseStatus(code=HttpStatus.CREATED) /*  Status =201 Created in new Students for the change for status*/
	public void createStudent(@RequestBody Student student) {
		//TODO: process POST request
		
		repo.save(student);
		
	}
	
	/*--------UPDATA the data is putmapping---------*/
	
	
	/* localhost:8080/students/update/103    change the data  */
	
	@PutMapping("/students/update/{id}")
	public Student updateStudent(@PathVariable int id ) {
		//TODO: process PUT request
		Student student=repo.findById(id).get();
		student.setName("Kabi");
		student.setEmail("kabi123@gmail.com");
		student.setAge(22);
		student.setBranch("Mech");
		
		repo.save(student);
		
		return student;
	}

	/*-----------DELETE the data--------------*/
	
	/*----------localhost:8080/students/delete/101  delete for the student data-----------*/
	
	@DeleteMapping("/students/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		
		repo.delete(student);
	}
	
}
