package com.example.bayernmunichproject.model.requestDto;

import lombok.Data;

@Data
public class MatchTicketRequestDto {
    private String ticketType;
    private Double price;
    private Integer availableQuantity;
    private Boolean isAvailable;
    private Long matchId;
}
