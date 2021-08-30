package com.hospital.doctor.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorApplication {

	@GetMapping("/getDoctorService")
	public String getDoctorService(){
		return "GetDoctor microservice called";
	}
	
	@GetMapping("/welcome/{name}")
	public String getDoctorWelcome(@PathVariable String name){
		return "Welcome "+ name + " !!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

}
