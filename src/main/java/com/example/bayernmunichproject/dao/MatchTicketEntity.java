package com.example.bayernmunichproject.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "match_tickets")
public class MatchTicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ticket_type")
    private String ticketType; // Type of ticket (e.g., Standard, VIP, Student)
    private Double price; // Price of the ticket
    @Column(name = "available_quantity")
    private Integer availableQuantity; // Number of available tickets for purchase
    @Column(name = "is_available")
    private Boolean isAvailable; // Whether the ticket is still available for sale

    @ManyToOne
    @JoinColumn(name = "match_id")
    private MatchEntity match; // The match this ticket is for

    //all following -> table
    private String seatCategory; // (Added) Example: VIP, Regular

    private LocalDateTime purchaseDate; // (Added) When the ticket was bought

    private String buyerName;

}

