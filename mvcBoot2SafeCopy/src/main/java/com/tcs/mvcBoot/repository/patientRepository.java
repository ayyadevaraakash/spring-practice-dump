package com.tcs.mvcBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.mvcBoot.model.Patient;

@Repository
public interface patientRepository extends JpaRepository<Patient, Integer> {

}
