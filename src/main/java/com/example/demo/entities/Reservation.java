package com.example.demo.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Boolean checked_in;
	private int number_of_bags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Reservation() {
		super();
	}

	public Boolean getChecked_in() {
		return checked_in;
	}

	public void setChecked_in(Boolean checked_in) {
		this.checked_in = checked_in;
	}

	public int getNumber_of_bags() {
		return number_of_bags;
	}

	public void setNumber_of_bags(int number_of_bags) {
		this.number_of_bags = number_of_bags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}



	public Reservation(Boolean checked_in, int number_of_bags, Passenger passenger, Flight flight) {
		super();
		this.checked_in = checked_in;
		this.number_of_bags = number_of_bags;
		this.passenger = passenger;
		this.flight = flight;
		
	}

}
