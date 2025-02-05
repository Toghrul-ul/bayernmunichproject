package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.PositionStatus;
import lombok.Data;

@Data
public class LeagueStandingResponseDto {
    private Long id;
    private Integer position;
    private Integer matchesPlayed;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    private Integer points;
    private String clubName;
    private String competitionName;
    private PositionStatus positionStatus;
}
