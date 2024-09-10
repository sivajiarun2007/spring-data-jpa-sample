package com.spring_data_jpa.sample.spring_data_jpa_sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_data_jpa.sample.spring_data_jpa_sample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
