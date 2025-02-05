package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.AchievementType;
import lombok.Data;

@Data
public class AchievementResponseDto {
    private Long id;
    private String title;
    private String year;
    private String clubName;
    private AchievementType achievementType;
    private String description;
}

