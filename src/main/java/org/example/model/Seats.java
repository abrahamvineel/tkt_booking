package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "seats")
public class Seats {

    private int id;
    private String seatNumber;
    private SeatStatus status;
    private Timestamp locked_at;
    private int booked_by;
    private Timestamp last_updated;
}
