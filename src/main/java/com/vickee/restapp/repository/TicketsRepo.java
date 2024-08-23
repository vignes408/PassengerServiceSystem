package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Tickets;

@Repository
public interface TicketsRepo extends JpaRepository<Tickets, Integer>{
	

}
