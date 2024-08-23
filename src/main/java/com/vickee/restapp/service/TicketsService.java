package com.vickee.restapp.service;

import java.util.List;
import java.util.Optional;

import com.vickee.restapp.model.Tickets;

public interface TicketsService {
	
	Tickets saveTicket(Tickets ticket);
    List<Tickets> getAllTickets();
    Optional<Tickets> getTicketById(int id);
}
