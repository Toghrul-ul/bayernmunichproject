package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.StatCategory;
import lombok.Data;

@Data
public class TopPlayerStatsResponseDto {
    private Long id;
    private Integer goals;
    private Integer assists;
    private Integer saves;
    private String playerName;
    private String clubName;
    private String competitionName;
    private StatCategory statCategory;
}
