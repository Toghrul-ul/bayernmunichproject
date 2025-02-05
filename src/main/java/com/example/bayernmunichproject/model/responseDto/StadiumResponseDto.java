package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.StadiumType;
import lombok.Data;

@Data
public class StadiumResponseDto {
    private Long id;
    private String name;
    private Integer capacity;
    private String location;
    private StadiumType stadiumType;
    private Boolean isIndoor;
    private Integer recordAttendance;
}
