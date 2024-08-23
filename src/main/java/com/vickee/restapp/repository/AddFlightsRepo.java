package com.vickee.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.AddFlights;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface AddFlightsRepo extends JpaRepository<AddFlights, Integer> {

	@Query(value="select * from flight_tbl where fdestination = :fdestination and tdestination = :tdestination", nativeQuery = true)
	public List<AddFlights> findByDestination( @Param("fdestination")String fdestination, @Param("tdestination")String tdestination);
	
	@Query(value="select flightid from flight_tbl", nativeQuery = true)
	List<Integer> fetchAllPids();
}
