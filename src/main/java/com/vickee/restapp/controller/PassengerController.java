package com.vickee.restapp.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vickee.restapp.model.Passenger;
import com.vickee.restapp.service.EmailService;
import com.vickee.restapp.service.PassengerService;

import jakarta.mail.MessagingException;

@RestController
@RequestMapping("/passadd")
@CrossOrigin("http://localhost:3000")
public class PassengerController {
	
	@Autowired
	PassengerService service;
	
	@PostMapping
	public void addPassenger(@RequestBody Passenger passenger) {
		service.addPassenger(passenger);
	}

	@GetMapping("/allpassenger")
	public List<Passenger> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	
	@Autowired
    private EmailService emailService;

	@PostMapping("/sendEmail")
	public ResponseEntity<String> sendEmail(
	    @RequestParam String from,
	    @RequestParam String to,
	    @RequestParam String subject,
	    @RequestParam String body,
	    @RequestParam(required = false) MultipartFile attachment
	) {
	    try {
	        emailService.sendEmail(from, to, subject, body, attachment); // Pass from to service
	        return ResponseEntity.ok("Email sent successfully");
	    } catch (MessagingException | IOException e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to send email: " + e.getMessage());
	    }
	}

}
