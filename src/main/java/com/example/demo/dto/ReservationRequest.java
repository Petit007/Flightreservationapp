package com.example.demo.dto;

import java.util.Date;

public class ReservationRequest {
	private int flightId;
	private String paxfirstname;
	private String	paxlastname;
	private String	email;
	private String	phone;
	private String paxcard;
	private String expirydate;
	private String securitycode;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getPaxfirstname() {
		return paxfirstname;
	}
	public void setPaxfirstname(String paxfirstname) {
		this.paxfirstname = paxfirstname;
	}
	public String getPaxlastname() {
		return paxlastname;
	}
	public void setPaxlastname(String paxlastname) {
		this.paxlastname = paxlastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPaxcard() {
		return paxcard;
	}
	public void setPaxcard(String paxcard) {
		this.paxcard = paxcard;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getSecuritycode() {
		return securitycode;
	}
	public void setSecuritycode(String securitycode) {
		this.securitycode = securitycode;
	}
	
}
