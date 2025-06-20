package service;

import java.util.List;

import com.model.Student;

public interface servicei {

	Student save(Student student);
	Student save(Student student,int id);
	List<Student> getstudent();
	

}
