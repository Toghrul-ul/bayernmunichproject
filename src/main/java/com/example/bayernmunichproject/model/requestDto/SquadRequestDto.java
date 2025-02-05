package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.Formation;
import lombok.Data;

@Data
public class SquadRequestDto {
    private String positionCategory;
    private Long clubId;
    private Formation formation;
}
