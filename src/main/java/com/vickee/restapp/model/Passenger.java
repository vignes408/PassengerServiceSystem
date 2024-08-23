package com.vickee.restapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "passenger_tbl")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerid;
	private String passname;
	private String gender;
	private String phonenumber;
	private String email;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private AddFlights flights;
	
	public Passenger() {
		super();
	}

	public Passenger(int passengerid, String passname, String gender, String phonenumber, String email,
			AddFlights flights) {
		super();
		this.passengerid = passengerid;
		this.passname = passname;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.email = email;
		this.flights = flights;
	}
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public String getPassname() {
		return passname;
	}
	public void setPassname(String passname) {
		this.passname = passname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public AddFlights getFlights() {
		return flights;
	}

	public void setFlights(AddFlights flights) {
		this.flights = flights;
	}
	
	
	
}
