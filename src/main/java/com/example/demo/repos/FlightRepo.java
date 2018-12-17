package com.example.demo.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Flight;



public interface FlightRepo extends JpaRepository<Flight, Integer> {
	@Query("from Flight where departure_city=:departurecity and arrivalcity=:arrivalcity and dateofdeparture=:dateofdeparture")
	List<Flight> findflights(@Param(value = "departurecity")String from,@Param(value = "arrivalcity")String to,@Param(value = "dateofdeparture") Date departureDate);

	
	
	

}
