package com.tcs.jpaDatabase.repo;

import com.tcs.jpaDatabase.beans.Employee;
import com.tcs.jpaDatabase.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    List<Employee> findBySalaryLessThan(int salary);

//    @Query("SELECT e FROM Employee e WHERE e.salary <= :value")
//    List<Employee> findPeople(int value);

    @Query(value = "select * from employee where salary <= :value", nativeQuery = true)
    List<Employee> findPeopleWithNativeQuery(int value);
}
