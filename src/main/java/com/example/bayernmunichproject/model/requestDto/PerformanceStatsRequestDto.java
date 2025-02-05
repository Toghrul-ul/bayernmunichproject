package com.example.bayernmunichproject.model.requestDto;

import lombok.Data;

@Data
public class PerformanceStatsRequestDto {
    private Integer goalsScored;
    private Integer goalsConceded;
    private Long clubId;
    private Long competitionId;
}
