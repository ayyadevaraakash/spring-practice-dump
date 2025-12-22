package com.tcs.schoolManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcs.schoolManagement.beans.Student;

@Configuration
public class AppConfigBackup {
	
	@Bean("student1")
	public Student getStudent() {
		Student s1 = new Student();
		s1.setName("Ramesh");
		s1.setRoll(1019115);
		return s1;
	}
	
}
