package com.vickee.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.Flights;
import com.vickee.restapp.serviceimpl.FlightServiceImpl;

@RestController
@RequestMapping("/flight")
@CrossOrigin("*")
public class FlightController {
	
	@Autowired
	FlightServiceImpl service;
	
	@PostMapping
	public void addFlight(@RequestBody Flights flight) {
		service.addFlight(flight);
	}
}
