package com.example.demo.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.ReservationRequest;
import com.example.demo.entities.Flight;
import com.example.demo.entities.Reservation;
import com.example.demo.repos.FlightRepo;
import com.example.demo.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	FlightRepo repo;
	@Autowired
	ReservationService service;
	
	@RequestMapping("/showcompletereservation")
	public String showcomplete(@RequestParam("flightId") int flightId,ModelMap modelmap) {
		Flight flight = repo.getOne(flightId);
		modelmap.addAttribute("flight", flight);
		return "completereservation";
		
	}
	@RequestMapping("/completereservation")
	public String reservation(ReservationRequest request, ModelMap modelmap) {
		Reservation booked = service.bookflight(request);
		modelmap.addAttribute("msg", "flight booked successfully and id is"+ booked.getId());
		return "confirm";
		
	}
}
