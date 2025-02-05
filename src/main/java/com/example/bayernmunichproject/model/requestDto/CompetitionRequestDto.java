package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.CompetitionType;
import lombok.Data;

@Data
public class CompetitionRequestDto {
    private String name;
    private String season;
    private CompetitionType competitionType;
}
