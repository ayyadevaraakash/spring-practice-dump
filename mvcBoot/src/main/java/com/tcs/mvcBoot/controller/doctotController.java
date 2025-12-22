package com.tcs.mvcBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.mvcBoot.model.Appointment;
import com.tcs.mvcBoot.service.doctorService;

@Controller
public class doctotController {
	
	@Autowired
	private doctorService ds;
	
	@GetMapping("/appoint")
	public String displayAppointmentForm() {
		return "appointmentForm";
	}
	
	@PostMapping("")
	public String processForm(@ModelAttribute Appointment appointment) {
		
		return "success";
	}

}
