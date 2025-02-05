package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.StadiumType;
import lombok.Data;

@Data
public class StadiumRequestDto {
    private String name;
    private Integer capacity;
    private String location;
    private StadiumType stadiumType;
}
