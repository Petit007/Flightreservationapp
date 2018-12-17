package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UpdateReservation;
import com.example.demo.entities.Reservation;
import com.example.demo.repos.ReservationRepo;

@RestController
public class ReservationRestController {
	@Autowired
	ReservationRepo repo;
	
	@GetMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id")int id) {
		return repo.getOne(id);
		
	}
	@PostMapping("/updatereservations")
	public Reservation findReservation(@RequestBody UpdateReservation request) {
		Reservation reservation = repo.getOne(request.getId());
		reservation.setChecked_in(request.getChecked_in());
		reservation.setNumber_of_bags(request.getNumber_of_bags());
		
		return repo.save(reservation);
		
	}
}
