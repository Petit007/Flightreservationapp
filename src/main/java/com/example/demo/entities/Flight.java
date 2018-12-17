package com.example.demo.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	  private String flight_number;
	  @Column(name="operating_airlines")
	  private String operatingairlines;
	  @Column(name="departure_city")
	  private String departurecity;
	  @Column(name="arrival_city")
	  private String arrivalcity;
	  @Column(name="date_of_departure")
	  private Date dateofdeparture;
	  @Column(name="ESTIMATED_DEPARTURE_TIME")
	  private Timestamp ESTIMATEDDEPARTURETIME;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Flight() {
		super();
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public String getOperatingairlines() {
		return operatingairlines;
	}
	public void setOperatingairlines(String operatingairlines) {
		this.operatingairlines = operatingairlines;
	}
	public String getDeparturecity() {
		return departurecity;
	}
	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}
	public String getArrivalcity() {
		return arrivalcity;
	}
	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}
	public Date getDateofdeparture() {
		return dateofdeparture;
	}
	public void setDateofdeparture(Date dateofdeparture) {
		this.dateofdeparture = dateofdeparture;
	}
	public Timestamp getESTIMATEDDEPARTURETIME() {
		return ESTIMATEDDEPARTURETIME;
	}
	public void setESTIMATEDDEPARTURETIME(Timestamp eSTIMATEDDEPARTURETIME) {
		ESTIMATEDDEPARTURETIME = eSTIMATEDDEPARTURETIME;
	}
	public Flight(int id, String flight_number, String operatingairlines, String departurecity, String arrivalcity,
			Date dateofdeparture, Timestamp eSTIMATEDDEPARTURETIME) {
		super();
		this.id = id;
		this.flight_number = flight_number;
		this.operatingairlines = operatingairlines;
		this.departurecity = departurecity;
		this.arrivalcity = arrivalcity;
		this.dateofdeparture = dateofdeparture;
		ESTIMATEDDEPARTURETIME = eSTIMATEDDEPARTURETIME;
	}
	
}
	
