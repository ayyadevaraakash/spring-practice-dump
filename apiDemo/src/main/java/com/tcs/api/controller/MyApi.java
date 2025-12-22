package com.tcs.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.api.beans.Employee;

@RestController
public class MyApi {
	
	@GetMapping("/employee")
	public ResponseEntity<Employee> getEmployee() {
		Employee e = new Employee(1, "Akash");
		return new ResponseEntity<>(e, HttpStatus.OK);
	}
	
	@GetMapping("/greeting")
	public ResponseEntity<String> getGreeting() {;
		return new ResponseEntity<>("Hello There!", HttpStatus.OK);
	}
	
}
