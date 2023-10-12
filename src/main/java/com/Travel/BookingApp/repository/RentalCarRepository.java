package com.Travel.BookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travel.BookingApp.model.RentalCar;

public interface RentalCarRepository extends JpaRepository<RentalCar, Long> {
    // Define custom queries if needed
}
