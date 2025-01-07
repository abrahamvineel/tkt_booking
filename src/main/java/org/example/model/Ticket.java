package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    private final long pnrNumber;
    private final String source;
    private final String destination;
    @OneToMany(cascade = CascadeType.ALL)
    private List<TicketRecord> ticketRecords;

    public Ticket(int pnrNumber, String source, String destination, List<TicketRecord> ticketRecords) {
        this.pnrNumber = pnrNumber;
        this.source = source;
        this.destination = destination;
        this.ticketRecords = ticketRecords;
    }
}
