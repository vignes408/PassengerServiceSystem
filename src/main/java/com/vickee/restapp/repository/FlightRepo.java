package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Flights;

@Repository
public interface FlightRepo extends JpaRepository<Flights, Integer> {

}
