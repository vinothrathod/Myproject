package com.Pumex.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.Pumex.API.dao.BootRepo;


@Controller
public class BootController {

	@Autowired
	BootRepo repo;
	
	@RequestMapping("/find")
	@ResponseBody
	public String getBoots () {
		
		return repo.findAll().toString();
	}
	
}

