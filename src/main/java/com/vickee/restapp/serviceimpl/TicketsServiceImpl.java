package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Tickets;
import com.vickee.restapp.repository.TicketsRepo;
import com.vickee.restapp.service.TicketsService;


@Service
public class TicketsServiceImpl implements TicketsService {
	
	@Autowired
	TicketsRepo repo;

	@Override
	public Tickets saveTicket(Tickets ticket) {
		return repo.save(ticket);
	}

	@Override
	public List<Tickets> getAllTickets() {
		return repo.findAll();
	}

	@Override
	public Optional<Tickets> getTicketById(int id) {
		return repo.findById(id);
	}
	

}
