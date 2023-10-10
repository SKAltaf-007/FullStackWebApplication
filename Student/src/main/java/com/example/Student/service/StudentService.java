package com.example.Student.service;

import java.util.List;

import com.example.Student.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
