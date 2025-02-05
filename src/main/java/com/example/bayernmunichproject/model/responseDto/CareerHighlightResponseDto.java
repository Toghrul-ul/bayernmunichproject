package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.HighlightType;
import lombok.Data;

@Data
public class CareerHighlightResponseDto {
    private Long id;
    private String title;
    private String description;
    private String year;
    private String playerName;
    private HighlightType highlightType;
}
