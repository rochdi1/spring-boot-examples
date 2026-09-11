package com.in28minutes.springboot.jpa.hibernate.h2.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
}
