package com.tcs.hibernateMtm.repo;

import com.tcs.hibernateMtm.beans.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
