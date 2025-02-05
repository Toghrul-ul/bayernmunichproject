package com.example.bayernmunichproject.model.requestDto;

import lombok.Data;

@Data
public class PlayerStatisticRequestDto {
    private Integer matchesPlayed;
    private Integer goalsScored;
    private Integer assists;
    private Integer cleanSheets;
    private Long playerId;
}
