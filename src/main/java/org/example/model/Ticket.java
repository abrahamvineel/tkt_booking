package org.example.model;

import java.util.List;

public class Ticket {
    private final int pnrNumber;
    private final String source;
    private final String destination;
    private List<TicketRecord> ticketRecords;

    public Ticket(int pnrNumber, String source, String destination, List<TicketRecord> ticketRecords) {
        this.pnrNumber = pnrNumber;
        this.source = source;
        this.destination = destination;
        this.ticketRecords = ticketRecords;
    }
}
