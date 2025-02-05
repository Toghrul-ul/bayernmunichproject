package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.HighlightType;
import lombok.Data;

@Data
public class CareerHighlightRequestDto {
    private String title;
    private String description;
    private String year;
    private Long playerId;
    private HighlightType highlightType;
}
