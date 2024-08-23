package com.vickee.restapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.Tickets;
import com.vickee.restapp.service.TicketsService;

@RestController
@RequestMapping("/tickets")
@CrossOrigin("*")
public class TicketController {
	
	@Autowired
	private TicketsService service;
	
    @PostMapping
    public Tickets createTicket(@RequestBody Tickets ticket) {
        return service.saveTicket(ticket);
    }

    @GetMapping
    public List<Tickets> getAllTickets() {
        return service.getAllTickets();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tickets> getTicketById(@PathVariable int id) {
        Optional<Tickets> ticket = service.getTicketById(id);
        return ticket.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
}
