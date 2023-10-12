package com.Travel.BookingApp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RentalCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String make;
    private String model;
    private int year;
    private String type; // Compact, SUV, Luxury, etc.
    private double dailyRate;
    private LocalDate pickupDate;
    private LocalDate returnDate;
    
	public RentalCar(Long id, String make, String model, int year, String type, double dailyRate, LocalDate pickupDate,
			LocalDate returnDate) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.type = type;
		this.dailyRate = dailyRate;
		this.pickupDate = pickupDate;
		this.returnDate = returnDate;
	}

	public RentalCar() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public LocalDate getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	
    
    // Getters and setters
    
    
    
}

