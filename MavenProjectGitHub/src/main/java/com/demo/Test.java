package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfig.class);
			Student s=(Student)apc.getBean("stu");
			System.out.println(s.getRollno());
			System.out.println(s.getName());
			System.out.println(s.getUname());
			System.out.println(s.getPass());
	}
	
	
}
