package com.example.demo.service;

import com.example.demo.dto.ReservationRequest;
import com.example.demo.entities.Reservation;

public interface ReservationService {

	public Reservation bookflight(ReservationRequest request);
	
}
