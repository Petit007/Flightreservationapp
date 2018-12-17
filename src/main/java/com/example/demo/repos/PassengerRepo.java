package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Passenger;


public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
