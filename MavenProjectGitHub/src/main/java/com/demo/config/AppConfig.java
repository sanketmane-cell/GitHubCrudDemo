package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.model.Student;

@Configuration
public class AppConfig {

	@Bean(name="stu")
	public Student s1() {
		Student s=new Student();
		s.setRollno(101);
		s.setName("Sanket");
		s.setUname("sanket123");
		s.setPass("sanket@23");
		return s;
	}
	
}
