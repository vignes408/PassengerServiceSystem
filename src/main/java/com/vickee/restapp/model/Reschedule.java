package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reschedule_tbl")
public class Reschedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reid;
	private String passname;
	private String email;
	private String pnrno;
	private String rescheddate;
	private String reason;
	private String status = "pending";
	public Reschedule() {
		super();
	}
	public Reschedule(int reid, String passname, String email, String pnrno, String rescheddate, String reason,
			String status) {
		super();
		this.reid = reid;
		this.passname = passname;
		this.email = email;
		this.pnrno = pnrno;
		this.rescheddate = rescheddate;
		this.reason = reason;
		this.status = status;
	}
	public int getReid() {
		return reid;
	}
	public void setReid(int reid) {
		this.reid = reid;
	}
	public String getPassname() {
		return passname;
	}
	public void setPassname(String passname) {
		this.passname = passname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPnrno() {
		return pnrno;
	}
	public void setPnrno(String pnrno) {
		this.pnrno = pnrno;
	}
	public String getRescheddate() {
		return rescheddate;
	}
	public void setRescheddate(String rescheddate) {
		this.rescheddate = rescheddate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	}
