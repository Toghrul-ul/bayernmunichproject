package com.example.bayernmunichproject.model.responseDto;

import lombok.Data;

@Data
public class PerformanceStatsResponseDto {
    private Long id;
    private Integer goalsScored;
    private Integer goalsConceded;
    private String clubName;
    private String competitionName;
}
