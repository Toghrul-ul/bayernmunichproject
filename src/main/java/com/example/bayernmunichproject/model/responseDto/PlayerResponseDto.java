package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.PlayerPosition;
import com.example.bayernmunichproject.enums.PlayerStatus;

import java.time.LocalDate;

public class PlayerResponseDto {
    private Long id;
    private String name;
    private Integer age;
    private String nationality;
    private PlayerPosition playerPosition;
    private PlayerStatus playerStatus;
    private String squadCategory;
    private Integer shirtNumber;
    private LocalDate contractEndDate;
}

