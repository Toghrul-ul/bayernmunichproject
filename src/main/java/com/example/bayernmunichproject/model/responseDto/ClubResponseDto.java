package com.example.bayernmunichproject.model.responseDto;

import lombok.Data;

import java.util.Date;
@Data
public class ClubResponseDto {
    private Long id;
    private String name;
    private Date foundedDate;
    private String stadiumName;
}
