 package com.example.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.model.Student;
import com.example.Student.repository.StudentRepository;
@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
}
