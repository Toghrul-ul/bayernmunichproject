package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.Formation;
import lombok.Data;

@Data
public class SquadResponseDto {
    private Long id;
    private String positionCategory;
    private String clubName;
    private Formation formation;
}
