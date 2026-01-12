package com.tcs.hospitalManagement.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.hospitalManagement.repo.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> fetchAllPatient() {
		List<Patient> list = patientRepository.findAll();
		return list;
	}

	public boolean savePatient(Patient patient) {
		try {
			patientRepository.save(patient);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean updatePatient(Patient patient, int id) {
		Patient patientFromDb = patientRepository.findById(id).orElse(null);
		if (patientFromDb == null) {
			return false;
		}
		patientFromDb.setName(patient.getName());
		patientFromDb.setDisease(patient.getDisease());
		patientFromDb.setPhone(patient.getPhone());
		
		patientRepository.save(patientFromDb);
		return true;
	}

	public boolean patchPatient(Patient patient, int id) {
		Patient patientFromDb = patientRepository.findById(id).orElse(null);
		if (patientFromDb == null) {
			return false;
		}
		if (patient.getName() != null) {
			patientFromDb.setName(patient.getName());
		}
		if (patient.getDisease() != null) {
			patientFromDb.setDisease(patient.getDisease());
		}
		if (patient.getPhone() != null) {
			patientFromDb.setPhone(patient.getPhone());
		}
		patientRepository.save(patientFromDb);
		return true;
	}

	public boolean deletePatient(int id) {
		Patient patientFromDb = patientRepository.findById(id).orElse(null);
		if (patientFromDb == null) {
			return false;
		}
		patientRepository.deleteById(id);
		return true;
	}
}