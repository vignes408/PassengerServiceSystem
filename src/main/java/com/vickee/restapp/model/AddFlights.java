package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_tbl")
public class AddFlights {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightid;
	private String flightName;
	private String fdestination;
	private String tdestination;
	private String airbrand;
	private String dtime;
	private String totaldur;
	private double price;
	public AddFlights() {
		super();
	}
	public AddFlights(int flightid, String flightName, String fdestination, String tdestination, String airbrand,
			String dtime, String totaldur, double price) {
		super();
		this.flightid = flightid;
		this.flightName = flightName;
		this.fdestination = fdestination;
		this.tdestination = tdestination;
		this.airbrand = airbrand;
		this.dtime = dtime;
		this.totaldur = totaldur;
		this.price = price;
	}
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
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
	public String getAirbrand() {
		return airbrand;
	}
	public void setAirbrand(String airbrand) {
		this.airbrand = airbrand;
	}
	public String getDtime() {
		return dtime;
	}
	public void setDtime(String dtime) {
		this.dtime = dtime;
	}
	public String getTotaldur() {
		return totaldur;
	}
	public void setTotaldur(String totaldur) {
		this.totaldur = totaldur;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	
	
}
