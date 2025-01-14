package org.example.service;


import org.example.dto.BookingRequest;
import org.example.model.Ticket;
import org.example.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    public void lockTicket(BookingRequest bookingRequest) {
        Random rand = new Random();
        rand.nextLong();
        //need to modify ticket entity and add a lock status to lock the ticket with expiration and then book
    }

    public void bookTicket(BookingRequest bookingRequest) {

    }
}
