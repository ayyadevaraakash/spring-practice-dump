package com.tcs.hospitalManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.hospitalManagement.beans.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
