package com.Travel.BookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Travel.BookingApp.service.RentalCarService;

@RestController
@RequestMapping("/rental-cars")
public class RentalCarController {

    @Autowired
    private RentalCarService rentalCarService;

    @GetMapping
    public ResponseEntity<List<RentalCar>> getAllRentalCars() {
        List<RentalCar> rentalCars = rentalCarService.getAllRentalCars();
        return new ResponseEntity<>(rentalCars, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RentalCar> getRentalCarById(@PathVariable Long id) {
        RentalCar rentalCar = rentalCarService.getRentalCarById(id);
        if (rentalCar != null) {
            return new ResponseEntity<>(rentalCar, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<RentalCar> bookRentalCar(@RequestBody RentalCar rentalCar) {
        RentalCar bookedRentalCar = rentalCarService.bookRentalCar(rentalCar);
        return new ResponseEntity<>(bookedRentalCar, HttpStatus.CREATED);
    }

    // Add more endpoints for searching and filtering rental cars
}
