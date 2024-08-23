package com.vickee.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer> {

}
