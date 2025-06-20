package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/student/{id}")
	public Student updatestudent(@RequestBody Student student,@PathVariable int id)
	{
		student.setId(id);
		return si.save(student);
		}
	@GetMapping("/students")
	public List<Student> getstudent(@RequestBody Student student)
	{
		return si.getstudent();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
