package com.tcs.hibernateMtm.repo;

import com.tcs.hibernateMtm.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
