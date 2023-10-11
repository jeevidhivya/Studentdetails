package com.example.Studentdetails.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Studentdetails.entity.Student;
import com.example.Studentdetails.repository.StudentRepository;

@Repository
public class StudentDao {
@Autowired
StudentRepository sturepo;
public Student agecheck(Student s) {
return sturepo.save(s);
}
}