package com.vickee.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.AddFlights;
import com.vickee.restapp.service.AddFlightsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/flightadd")
@CrossOrigin("*")
public class AddFlightsController {

	@Autowired
	AddFlightsService service;
	
	@PostMapping
	public void addFlights(@RequestBody AddFlights flights) {
		service.addFlightDetails(flights);
	}
	@GetMapping("/allflights")
	public List<AddFlights> getAllFlights() {
		return service.getAllFlights();
	}
	
	@GetMapping("/searchflight/{fdestination}/{tdestination}")
	public List<AddFlights> getByDestination(@PathVariable String fdestination, @PathVariable String tdestination ){
		return service.getByDestination(fdestination, tdestination);
	}
	
	@GetMapping("/pidList")
	public List<Integer> getAllPids()
	{
		return service.getAllPids();
	}
}
