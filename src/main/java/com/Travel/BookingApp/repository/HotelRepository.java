package com.Travel.BookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travel.BookingApp.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    // Define custom queries if needed
}