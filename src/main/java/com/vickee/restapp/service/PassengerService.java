package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Passenger;

public interface PassengerService {
	
	public String addPassenger(Passenger passenger);
	public List<Passenger> getAllEmployees();
}
