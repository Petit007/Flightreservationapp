package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Reservation;


public interface ReservationRepo extends JpaRepository<Reservation, Integer> {

}
