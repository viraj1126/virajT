package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.Studentrepository;

import service.servicei;
@Service
public class Serviceimpl implements servicei{
	
	@Autowired
	Studentrepository sr;

	@Override
	public Student save(Student student) {
		
		return sr.save(student) ;
	}
}
