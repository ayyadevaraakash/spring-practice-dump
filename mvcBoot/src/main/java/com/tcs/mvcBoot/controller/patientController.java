package com.tcs.mvcBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.mvcBoot.model.Patient;
import com.tcs.mvcBoot.service.patientService;

@Controller
public class patientController {
	
	@Autowired
	private patientService patientService;
	
	@GetMapping("/")
	public String displayHomepage() {
		return "homepage";
	}
	
	@GetMapping("/admit")
	public String displayAdmitForm() {
		return "admitForm";
	}
	
	@PostMapping("/successMethod")
	public String processForm(@ModelAttribute Patient patient) {
		patientService.storePatientData(patient);
		return "success";
	}
	
}
