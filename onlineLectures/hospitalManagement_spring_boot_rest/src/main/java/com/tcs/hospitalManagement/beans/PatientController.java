package com.tcs.hospitalManagement.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/api/patient")
	public ResponseEntity<?> getAllPatients() {
		List<Patient> list = patientService.fetchAllPatient();  
		return ResponseEntity.status(200).body(list);
	}
	
	@PostMapping("/api/patient")
	public ResponseEntity<?> postPatient(@RequestBody Patient patient) {
		boolean result = patientService.savePatient(patient);
		if (result == true) {
			return ResponseEntity.status(201).body("Patient Inserted Successfully");
		} else {
			return ResponseEntity.status(500).body("Some Error Occurred");
		}
	}
	
	@PutMapping("/api/patient/{id}")
	public ResponseEntity<?> updatePatient(@PathVariable int id, @RequestBody Patient patient) {
		boolean result = patientService.updatePatient(patient, id);
		if (result == true) {
			return ResponseEntity.status(200).body("Patient Updated Successfully");
		} else {
			return ResponseEntity.status(500).body("Some Error Occurred");
		}
	}
	
	@PatchMapping("/api/patient/{id}")
	public ResponseEntity<?> patchPatient(@PathVariable int id, @RequestBody Patient patient) {
		boolean result = patientService.patchPatient(patient, id);
		if (result == true) {
			return ResponseEntity.status(200).body("Patient Updated Successfully");
		} else {
			return ResponseEntity.status(500).body("Some Error Occurred");
		}
	}
	
	@DeleteMapping("/api/patient/{id}")
	public ResponseEntity<?> deletePatient(@PathVariable int id) {
		boolean result = patientService.deletePatient(id);
		if (result == true) {
			return ResponseEntity.status(200).body("Patient Deleted Successfully");
		} else {
			return ResponseEntity.status(500).body("Some Error Occurred");
		}
	}
}
