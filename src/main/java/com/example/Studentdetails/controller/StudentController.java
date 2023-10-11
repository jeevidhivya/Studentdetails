package com.example.Studentdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Studentdetails.entity.Student;
import com.example.Studentdetails.Exception.AgeBelowException;
import com.example.Studentdetails.service.StudentService;

@RestController
@RequestMapping(value="/Student")

public class StudentController {
	@Autowired
	StudentService stuser;
	@PostMapping(value="/age")
	public Student agecheck(@RequestBody Student s) throws AgeBelowException {
		return stuser.agecheck(s);
	}
}
