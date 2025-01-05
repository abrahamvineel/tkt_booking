package org.example.model;

public class TicketRecord {
    private final String coachNumber;
    private final String berthNumber;
    private Person person;
    private final double price;

    public TicketRecord(String coachNumber, String berthNumber, Person person, double price) {
        this.coachNumber = coachNumber;
        this.berthNumber = berthNumber;
        this.person = person;
        this.price = price;
    }
}
