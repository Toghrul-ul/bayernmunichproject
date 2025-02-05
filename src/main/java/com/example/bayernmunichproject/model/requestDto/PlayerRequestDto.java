package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.PlayerPosition;
import com.example.bayernmunichproject.enums.PlayerStatus;
import lombok.Data;

@Data
public class PlayerRequestDto {
    private String name;
    private Integer age;
    private String nationality;
    private PlayerPosition playerPosition;
    private PlayerStatus playerStatus;
    private Long squadId;
}

