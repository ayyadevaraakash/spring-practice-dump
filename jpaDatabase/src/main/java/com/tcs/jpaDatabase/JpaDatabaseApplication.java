package com.tcs.jpaDatabase;

import com.tcs.jpaDatabase.beans.Employee;
import com.tcs.jpaDatabase.repo.EmployeeRepository;
import com.tcs.jpaDatabase.repo.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaDatabaseApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaDatabaseApplication.class, args);
	}

	@Transactional
	void insertRow() {
		Employee e = new Employee();
		e.setName("Ruchitha");
		e.setSalary(3000);
		employeeRepo.save(e);
	}

	void readAll() {
		List<Employee> res = employeeRepo.findAll();
		System.out.println(res);
	}

	@Transactional
	void readById(int id) {
		Optional<Employee> res = employeeRepo.findById(id);
		if (res.isPresent()) {
			System.out.println(res);
		} else {
			System.out.println("Employee does not exist");
		}
	}

	@Transactional
	@Modifying
	void updateEmployee(int id) {
		employeeRepo.findById(id).ifPresentOrElse(employee -> {
			employee.setSalary(8000);
			employeeRepo.save(employee);
		}, () -> {
			throw new EntityNotFoundException("Employee Not Found");
		});
	}

	void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}

	void getEmployeeFilter() {
		List<Employee> res = employeeRepo.findPeopleWithNativeQuery(5000);
		System.out.println(res);
	}

	@Override
	public void run(String... args) throws Exception {
//		insertRow();
//		readAll();
//		updateEmployee(1);
//		readById(1);
//		deleteEmployee(1);
		getEmployeeFilter();
	}
}
