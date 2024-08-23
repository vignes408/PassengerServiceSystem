package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Passenger;
import com.vickee.restapp.repository.PassengerRepo;
import com.vickee.restapp.service.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	PassengerRepo repo;
	@Override
	public String addPassenger(Passenger passenger) {
		if(passenger!=null) {
		repo.save(passenger);
		return "success";
		}
		else {
		return "failure";
		}
	}
	@Override
	public List<Passenger> getAllEmployees() {
		return repo.findAll();
	}

}
