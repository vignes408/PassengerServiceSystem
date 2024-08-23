package com.vickee.restapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reg_tbl")
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passid;
	private String passname;
	private String passusername;
	private String email;
	private String password;
	public Register() {
		super();
	}
	public Register(int passid, String passname, String passusername, String email, String password) {
		super();
		this.passid = passid;
		this.passname = passname;
		this.passusername = passusername;
		this.email = email;
		this.password = password;
	}
	public int getPassid() {
		return passid;
	}
	public void setPassid(int passid) {
		this.passid = passid;
	}
	public String getPassname() {
		return passname;
	}
	public void setPassname(String passname) {
		this.passname = passname;
	}
	public String getPassusername() {
		return passusername;
	}
	public void setPassusername(String passusername) {
		this.passusername = passusername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
