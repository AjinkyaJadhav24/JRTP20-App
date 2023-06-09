package com.example.sms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sms.Service.StudentService;

@Controller
public class StudentController {

private StudentService studentService;

public StudentController(StudentService studentService) {
	super();
	this.studentService = studentService;
}

@GetMapping("/students")
public String listStudents(Model   model) {
model.addAttribute("students", studentService.getAllStudents());
return "students";
}
}
