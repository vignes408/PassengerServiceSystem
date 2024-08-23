package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket_tbl")
public class Tickets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String flightName;
	private String fdestination;
	private String tdestination;
	private String dtime;
	private String airbrand;
	private double price;
	private String passengerName;
	private String passengerEmail;
	private long passengerPhone;
	private String passgenerGender;
	private String paymentMethod;
	private String transactionId;
	public Tickets() {
		super();
	}
	public Tickets(int id, String flightName, String fdestination, String tdestination, String dtime, String airbrand,
			double price, String passengerName, String passengerEmail, long passengerPhone, String passgenerGender,
			String paymentMethod, String transactionId) {
		super();
		this.id = id;
		this.flightName = flightName;
		this.fdestination = fdestination;
		this.tdestination = tdestination;
		this.dtime = dtime;
		this.airbrand = airbrand;
		this.price = price;
		this.passengerName = passengerName;
		this.passengerEmail = passengerEmail;
		this.passengerPhone = passengerPhone;
		this.passgenerGender = passgenerGender;
		this.paymentMethod = paymentMethod;
		this.transactionId = transactionId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFdestination() {
		return fdestination;
	}
	public void setFdestination(String fdestination) {
		this.fdestination = fdestination;
	}
	public String getTdestination() {
		return tdestination;
	}
	public void setTdestination(String tdestination) {
		this.tdestination = tdestination;
	}
	public String getDtime() {
		return dtime;
	}
	public void setDtime(String dtime) {
		this.dtime = dtime;
	}
	public String getAirbrand() {
		return airbrand;
	}
	public void setAirbrand(String airbrand) {
		this.airbrand = airbrand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public long getPassengerPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(long passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	public String getPassgenerGender() {
		return passgenerGender;
	}
	public void setPassgenerGender(String passgenerGender) {
		this.passgenerGender = passgenerGender;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	
	
	
	

}
