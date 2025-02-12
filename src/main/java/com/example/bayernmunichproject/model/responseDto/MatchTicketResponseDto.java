package com.example.bayernmunichproject.model.responseDto;

import java.time.LocalDateTime;

public class MatchTicketResponseDto {
    private Long id;
    private String ticketType;
    private Double price;
    private Integer availableQuantity;
    private Boolean isAvailable;
    private String matchDetails;
    private String seatCategory;
    private LocalDateTime purchaseDate;
    private String buyerName;
}