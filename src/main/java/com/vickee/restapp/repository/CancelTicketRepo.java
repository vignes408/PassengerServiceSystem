package com.vickee.restapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.CancelTicket;

@Repository
public interface CancelTicketRepo extends JpaRepository<CancelTicket, Integer> {

}
