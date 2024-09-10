package com.spring_data_jpa.sample.spring_data_jpa_sample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Component
public class Student {

	@Id
	private Long id;
	private String name;
	private Long marks;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
