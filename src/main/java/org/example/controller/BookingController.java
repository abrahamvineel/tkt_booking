package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.BookingRequest;
import org.example.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping("/lock")
    @ResponseStatus(HttpStatus.CREATED)
    public void lockTicket(@RequestBody BookingRequest bookingRequest) {
        bookingService.lockTicket(bookingRequest);
    }

    @PostMapping("/book")
    @ResponseStatus(HttpStatus.CREATED)
    public void bookTicket(@RequestBody BookingRequest bookingRequest) {
        bookingService.bookTicket(bookingRequest);
    }
}
