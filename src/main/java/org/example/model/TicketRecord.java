package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ticket_record")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String coachNumber;
    private String berthNumber;
    private String name;
    private int age;
    private String gender;
    private int number;
    private String email;
    private double price;
}
