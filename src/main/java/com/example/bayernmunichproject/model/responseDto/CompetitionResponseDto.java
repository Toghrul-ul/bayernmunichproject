package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.CompetitionType;
import lombok.Data;

@Data
public class CompetitionResponseDto {
    private Long id;
    private String name;
    private String season;
    private CompetitionType competitionType;
}
