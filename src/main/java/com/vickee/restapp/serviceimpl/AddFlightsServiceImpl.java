package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.AddFlights;
import com.vickee.restapp.repository.AddFlightsRepo;
import com.vickee.restapp.service.AddFlightsService;

@Service
public class AddFlightsServiceImpl implements AddFlightsService {

	@Autowired
	AddFlightsRepo repo;
	@Override
	public String addFlightDetails(AddFlights flights) {
		if(flights!=null) {
			repo.save(flights);
			return "success";
			}
			else {
				return "failure";
			}
	}
	@Override
	public List<AddFlights> getAllFlights() {
		return (List<AddFlights>) repo.findAll();
	}
	@Override
	public List<AddFlights> getByDestination(String fdest, String tdest) {
		return repo.findByDestination(fdest, tdest);
	}
	@Override
	public List<Integer> getAllPids() {
		return repo.fetchAllPids();
	}

}
