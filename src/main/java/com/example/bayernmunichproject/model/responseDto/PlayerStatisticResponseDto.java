package com.example.bayernmunichproject.model.responseDto;

import lombok.Data;

@Data
public class PlayerStatisticResponseDto {
    private Long id;
    private Integer matchesPlayed;
    private Integer goalsScored;
    private Integer assists;
    private Integer cleanSheets;
    private String playerName;
}
