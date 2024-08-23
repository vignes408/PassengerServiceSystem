package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cancel_tbl")
public class CancelTicket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cancelid;
	private String passname;
	private long phonenumber;
	private String reason;
	private String transactionid;
	private String status = "pending";
	
	public CancelTicket() {
		super();
	}
	
	public CancelTicket(int cancelid, String passname, long phonenumber, String reason, String transactionid, String status) {
		super();
		this.cancelid = cancelid;
		this.passname = passname;
		this.phonenumber = phonenumber;
		this.reason = reason;
		this.transactionid = transactionid;
		this.status=status;
	}
	
	public int getCancelid() {
		return cancelid;
	}
	public void setCancelid(int cancelid) {
		this.cancelid = cancelid;
	}
	public String getPassname() {
		return passname;
	}
	public void setPassname(String passname) {
		this.passname = passname;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
