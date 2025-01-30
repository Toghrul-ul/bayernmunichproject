package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.PositionStatus;

public class LeagueStandingRequestDto {
    private Integer position;
    private Integer matchesPlayed;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    private Integer points;
    private Long clubId;
    private Long competitionId;
    private PositionStatus positionStatus;
}
