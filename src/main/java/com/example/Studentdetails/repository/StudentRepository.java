package com.example.Studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Studentdetails.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
