package com.tcs.hibernateOtm.repo;

import com.tcs.hibernateOtm.beans.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
