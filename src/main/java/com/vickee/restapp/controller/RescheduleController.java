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
import com.vickee.restapp.model.Reschedule;
import com.vickee.restapp.service.ResheduleService;

@RestController
@RequestMapping("/addre")
@CrossOrigin("*")
public class RescheduleController {
	
	@Autowired
	ResheduleService service;
	
	@PostMapping
	public void addReschedule(@RequestBody Reschedule re) {
		service.addReshedule(re);
	}
	
	@GetMapping("/allre")
	public List<Reschedule> getAllCancel()
	{
		return service.getAllSchedule();
	}
	
	 @PutMapping("/approve/{id}")
	 public ResponseEntity<Reschedule> approveRequest(@PathVariable int id) {
	        Reschedule updatedRequest = service.approveRequest(id);
	        return ResponseEntity.ok(updatedRequest);
	    }
	  

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> rejectRequest(@PathVariable int id) {
	        service.rejectRequest(id);
	        return ResponseEntity.noContent().build();
	    }
}
