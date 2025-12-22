package com.tcs.mvcBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.mvcBoot.model.Patient;
import com.tcs.mvcBoot.repository.patientRepository;

@Service
public class patientService {
	
	@Autowired
	private patientRepository patientRepo;
	
	public void storePatientData(Patient patient) {
		patientRepo.save(patient);
	}
	
}
