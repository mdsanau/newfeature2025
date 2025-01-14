package com.patient;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	@GetMapping("/allPatient")
	public String getAllPatients() {
		return "All Patients";
	}
	

	
}
