package com.spring_data_jpa.sample.spring_data_jpa_sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_data_jpa.sample.spring_data_jpa_sample.entity.Student;
import com.spring_data_jpa.sample.spring_data_jpa_sample.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public void addStudent(Student student) {
		System.out.println("adding Student");
//		studentRepo.save(student);
	}

	public void getAllStudents() {
//		System.out.println(studentRepo.fetchAllStudents());
	}

}
