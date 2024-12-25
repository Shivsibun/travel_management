package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {
    private final TravelService travelService;

    public BookingController(TravelService travelService) {
        this.travelService = travelService;
    }

    @GetMapping("/trips")
    public List<Trip> getAllTrips() {
        return travelService.getAllTrips();
    }

    @PostMapping("/bookings")
    public Booking createBooking(@RequestBody Booking booking) {
        return travelService.addBooking(booking);
    }
}
