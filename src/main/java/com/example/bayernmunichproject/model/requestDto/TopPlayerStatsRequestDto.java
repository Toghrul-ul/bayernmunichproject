package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.StatCategory;

public class TopPlayerStatsRequestDto {
    private Integer goals;
    private Integer assists;
    private Integer saves;
    private Long playerId;
    private Long clubId;
    private Long competitionId;
    private StatCategory statCategory;
}
