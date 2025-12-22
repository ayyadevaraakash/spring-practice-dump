package com.tcs.mvcBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.mvcBoot.model.Appointment;

@Repository
public interface doctorRepository extends JpaRepository<Appointment, Integer>{

}
