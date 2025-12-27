package com.tcs.hibernateOtm;

import com.tcs.hibernateOtm.beans.Course;
import com.tcs.hibernateOtm.beans.Student;
import com.tcs.hibernateOtm.repo.CourseRepository;
import com.tcs.hibernateOtm.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HibernateOtmApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateOtmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// WORKING CODE
		Student s1 = new Student();
		s1.setName("Akash");
		studentRepository.save(s1);

		Course c1 = new Course();
		c1.setTitle("java");
		c1.setPrice(100);
		c1.setStudent(s1);

		Course c2 = new Course();
		c2.setTitle("java");
		c2.setPrice(100);
		c2.setStudent(s1);

		courseRepository.save(c1);
		courseRepository.save(c2);

		studentRepository.delete(s1);
	}

}
