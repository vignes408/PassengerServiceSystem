package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.AddFlights;

public interface AddFlightsService {
	
	public String addFlightDetails(AddFlights flights);
	public List<AddFlights> getAllFlights();
	public List<AddFlights> getByDestination(String fdest, String tdest);
	public List<Integer> getAllPids();
	
	
}
