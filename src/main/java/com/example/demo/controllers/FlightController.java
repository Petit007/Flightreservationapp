package com.example.demo.controllers;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Flight;
import com.example.demo.repos.FlightRepo;

@Controller
public class FlightController {

	@Autowired
	FlightRepo flightrepo;
	
	
	@RequestMapping("/findflight")
	public String flight(@RequestParam("from")String from,@RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy")Date departureDate, ModelMap modelmap) {
		List<Flight> fli = flightrepo.findflights(from,to,departureDate);
		System.out.println(fli);
		modelmap.addAttribute("fli", fli);
																																																
		return "displayflight";
	}
}
