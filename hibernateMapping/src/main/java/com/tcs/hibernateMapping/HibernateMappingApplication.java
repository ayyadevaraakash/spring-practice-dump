package com.tcs.hibernateMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.hibernateMapping.beans.Employee;
import com.tcs.hibernateMapping.beans.Laptop;
import com.tcs.hibernateMapping.repo.EmployeeRepository;
import com.tcs.hibernateMapping.repo.LaptopRepository;

@SpringBootApplication
public class HibernateMappingApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private LaptopRepository laptopRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingApplication.class, args);
	}
	
	@Transactional
	@Modifying
	void doDatabaseOperation() {
		Laptop laptop = new Laptop();
		laptop.setAsset_id(2354);
		laptop.setCompany("HP");
		laptopRepository.save(laptop);
		
		Employee e = new Employee();
		e.setName("Akash");
		e.setLaptop(laptop);		
		employeeRepository.save(e);
	}

	@Override
	public void run(String... args) throws Exception {
		doDatabaseOperation();
	}

}
