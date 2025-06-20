package com.serviceimpl;

import java.util.List;

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

	@Override
	public Student save(Student student, int id) {
		// TODO Auto-generated method stub
		student.setId(id);
		return sr.save(student);
	}

	@Override
	public List<Student> getstudent() {
		// TODO Auto-generated method stub
		return (List<Student>) sr.findAll();
	}
}
