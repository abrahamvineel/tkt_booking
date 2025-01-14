package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "ticket")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Ticket {
    @Id
    private long pnrNumber;
    private String source;
    private String destination;
    @OneToMany(cascade = CascadeType.ALL)
    private List<TicketRecord> ticketRecords;

    public Ticket(int pnrNumber, String source, String destination, List<TicketRecord> ticketRecords) {
        this.pnrNumber = pnrNumber;
        this.source = source;
        this.destination = destination;
        this.ticketRecords = ticketRecords;
    }
}
