package com.Pumex.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Boot {

	@Id
	private int id;
	private String name;
	private String tech;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Boot [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
	
	
	
	
}