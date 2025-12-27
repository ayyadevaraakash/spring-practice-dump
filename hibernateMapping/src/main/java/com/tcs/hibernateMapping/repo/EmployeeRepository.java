package com.tcs.hibernateMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.hibernateMapping.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
