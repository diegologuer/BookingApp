package com.Travel.BookingApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.Travel.BookingApp.model.Hotel;
import com.Travel.BookingApp.repository.HotelRepository;
import com.Travel.BookingApp.service.HotelService;

class HotelServiceTest {

    @MockBean
    private HotelRepository hotelRepository;

    private HotelService hotelService;

    @Test
    void testGetAllHotels() {
        // Arrange
        List<Hotel> mockHotels = new ArrayList<>();
        mockHotels.add(new Hotel(1L, "Hotel A", "Location A", 100.0, 4, "WiFi, Parking", LocalDate.now(), LocalDate.now()));
        mockHotels.add(new Hotel(2L, "Hotel B", "Location B", 150.0, 5, "WiFi, Pool", LocalDate.now(), LocalDate.now()));
        when(hotelRepository.findAll()).thenReturn(mockHotels);

        // Act
        List<Hotel> hotels = hotelService.getAllHotels();

        // Assert
        assertEquals(2, hotels.size());
    }

    @Test
    void testGetHotelById() {
        // Arrange
        Long hotelId = 1L;
        Hotel mockHotel = new Hotel(hotelId, "Hotel A", "Location A", 100.0, 4, "WiFi, Parking", LocalDate.now(), LocalDate.now());
        when(hotelRepository.findById(hotelId)).thenReturn(Optional.of(mockHotel));

        // Act
        Hotel hotel = hotelService.getHotelById(hotelId);

        // Assert
        assertNotNull(hotel);
        assertEquals(hotelId, hotel.getId());
    }

    // Add more test cases for HotelService as needed.
}

