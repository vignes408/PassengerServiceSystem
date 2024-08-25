package com.vickee.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.CancelTicket;
import com.vickee.restapp.service.CancelTicketService;

@RestController
@RequestMapping("/addcancel")
@CrossOrigin(origins = "http://localhost:3000")

public class CancelTicketController {
	
	@Autowired
	CancelTicketService service;

	@PostMapping
	public void addFlights(@RequestBody CancelTicket cancel) {
		service.addCancelTicket(cancel);
	}
	
	@GetMapping("/allcancel")
	public List<CancelTicket> getAllCancel()
	{
		return service.getAllCancel();
	}
	
	  @PutMapping("/approve/{id}")
	    public ResponseEntity<CancelTicket> approveRequest(@PathVariable int id) {
	        CancelTicket updatedRequest = service.approveRequest(id);
	        return ResponseEntity.ok(updatedRequest);
	    }
	  

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> rejectRequest(@PathVariable int id) {
	        service.rejectRequest(id);
	        return ResponseEntity.noContent().build();
	    }
	    
	    @GetMapping("/{cancelid}")
	    public CancelTicket getCancelId(@PathVariable("cancelid") int cancelid) {
	    	return service.fetchId(cancelid);
	    }
//	    
//	    @GetMapping("/{pnrno}")
//	    public CancelTicket getPnrNo(@PathVariable("pnrno") int pnrno) {
//	    	return service.fetchPnr(pnrno);
//	    }
//	    
}
