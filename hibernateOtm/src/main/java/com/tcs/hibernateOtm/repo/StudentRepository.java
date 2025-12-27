package com.tcs.hibernateOtm.repo;

import com.tcs.hibernateOtm.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
