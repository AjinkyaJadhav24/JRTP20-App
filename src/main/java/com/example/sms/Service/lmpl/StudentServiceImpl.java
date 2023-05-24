package com.example.sms.Service.lmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sms.Entity.Student;
import com.example.sms.Repository.StudentRepository;
import com.example.sms.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	
private StudentRepository studentRepository;
	public StudentServiceImpl(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
}




	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
