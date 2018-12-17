package com.example.demo.dto;

public class UpdateReservation {
	private int id;
	private Boolean checked_in;
	private int number_of_bags;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
