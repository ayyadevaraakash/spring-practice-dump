package com.tcs.mvcBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.mvcBoot.model.Appointment;
import com.tcs.mvcBoot.repository.doctorRepository;

@Service
public class doctorService {

	@Autowired
	private doctorRepository doctorRepo;

	public void storeAppointmentData(Appointment appointment) {
		doctorRepo.save(appointment);
	}

}
