package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.BookingRequest;
import org.example.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String book(@RequestBody BookingRequest bookingRequest) {
        return "e";
    }
}
