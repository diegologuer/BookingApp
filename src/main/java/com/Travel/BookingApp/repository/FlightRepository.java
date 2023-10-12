package com.Travel.BookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travel.BookingApp.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    // Define custom queries if needed
}
