package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Reschedule;

@Repository
public interface RescheduleRepo extends JpaRepository<Reschedule,Integer>{

}
