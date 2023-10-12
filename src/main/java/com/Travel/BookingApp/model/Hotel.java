package com.Travel.BookingApp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String location;
    private double pricePerNight;
    private int starRating;
    private String amenities; // You can store amenities as a comma-separated string or use a separate entity for amenities.
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    
    
    
	public Hotel() {
		super();
	}

	public Hotel(Long id, String name, String location, double pricePerNight, int starRating, String amenities,
			LocalDate checkInDate, LocalDate checkOutDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.pricePerNight = pricePerNight;
		this.starRating = starRating;
		this.amenities = amenities;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	
    
    // Getters and setters
}

