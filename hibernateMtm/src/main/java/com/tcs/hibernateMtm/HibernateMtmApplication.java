package com.tcs.hibernateMtm;

import com.tcs.hibernateMtm.beans.Course;
import com.tcs.hibernateMtm.beans.Student;
import com.tcs.hibernateMtm.repo.CourseRepository;
import com.tcs.hibernateMtm.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HibernateMtmApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateMtmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student();
		s1.setName("Akash");

		Student s2 = new Student();
		s2.setName("Ruchitha");

		Course c1 = new Course();
		c1.setTitle("Java");

		Course c2 = new Course();
		c2.setTitle("Python");

		Course c3 = new Course();
		c3.setTitle("C++");

		Course c4 = new Course();
		c4.setTitle("JavaScript");

		courseRepository.save(c1);
		courseRepository.save(c2);
		courseRepository.save(c3);
		courseRepository.save(c4);

		List<Course> forStudentOne = List.of(c2,c3);
		List<Course> forStudentTwo = List.of(c1,c2,c4);

		s1.setCourses(forStudentOne);
		s2.setCourses(forStudentTwo);

		studentRepository.save(s1);
		studentRepository.save(s2);

	}
}
