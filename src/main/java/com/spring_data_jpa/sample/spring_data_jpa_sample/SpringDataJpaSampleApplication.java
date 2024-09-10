package com.spring_data_jpa.sample.spring_data_jpa_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring_data_jpa.sample.spring_data_jpa_sample.entity.Student;
import com.spring_data_jpa.sample.spring_data_jpa_sample.repo.StudentRepository;

@SpringBootApplication
public class SpringDataJpaSampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringDataJpaSampleApplication.class, args);
		
		
		Student stud1 = new Student();
		stud1.setId(2l);
		stud1.setMarks(101l);
		stud1.setName("Sia");
		
		StudentRepository repo = ctx.getBean(StudentRepository.class);
//		repo.save(stud1);
		
		
		System.out.println(repo.findAll());
		
	}

}
