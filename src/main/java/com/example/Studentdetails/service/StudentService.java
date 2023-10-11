package com.example.Studentdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Studentdetails.Exception.AgeBelowException;
import com.example.Studentdetails.dao.StudentDao;
import com.example.Studentdetails.entity.Student;

@Service
public class StudentService {
 @Autowired
 StudentDao stuDao;
 
 public Student agecheck(Student s) throws AgeBelowException {
	stuDao.agecheck(s);
	if(s.getAge() >18) {
		return stuDao.agecheck(s);
}else {
	throw new AgeBelowException("age must be below 18");
}
}

}

