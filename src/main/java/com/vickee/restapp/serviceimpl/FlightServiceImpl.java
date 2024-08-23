package com.vickee.restapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Flights;
import com.vickee.restapp.repository.FlightRepo;
import com.vickee.restapp.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepo repo;
	@Override
	public String addFlight(Flights flight) {

		if(flight!=null) {
			repo.save(flight);
			return "success";
			}
			else {
				return "failure";
			}
	}

}
