package com.Pumex.API.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Name")
	private String Name;
	
	@Column
	private String Email;
	
	@Column
	private String Courses;
	
	public User() {
		
	}

	

	public User(String name, String email, String courses) {
		super();
		Name = name;
		Email = email;
		Courses = courses;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getCourses() {
		return Courses;
	}



	public void setCourses(String courses) {
		Courses = courses;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Courses=" + Courses + "]";
	}



	
	
	
}
