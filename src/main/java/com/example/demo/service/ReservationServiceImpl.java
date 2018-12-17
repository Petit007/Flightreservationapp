package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ReservationRequest;
import com.example.demo.entities.Flight;
import com.example.demo.entities.Passenger;
import com.example.demo.entities.Reservation;
import com.example.demo.repos.FlightRepo;
import com.example.demo.repos.PassengerRepo;
import com.example.demo.repos.ReservationRepo;
@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	FlightRepo repo;
	@Autowired
	PassengerRepo paxrepo;
	@Autowired
	ReservationRepo reserve;

	@Override
	public Reservation bookflight(ReservationRequest request) {
		int flightId = request.getFlightId();
		Flight flight = repo.getOne(flightId);

		Passenger passenger = new Passenger();
		passenger.setFirst_name(request.getPaxfirstname());
		passenger.setLast_name(request.getPaxlastname());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());

		Passenger savedpax = paxrepo.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setChecked_in(false);
		reservation.setPassenger(savedpax);
		reservation.setFlight(flight);
		Reservation savedRes = reserve.save(reservation);
		return savedRes;
	}

}
