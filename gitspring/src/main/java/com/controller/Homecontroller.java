package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

import service.servicei;

@RestController
public class Homecontroller {
	
	
	@Autowired
	servicei si;
	@PostMapping("/student")
	public Student addstudent(@RequestBody Student student)
	{
		
		return si.save(student);
	}
	
	

}
