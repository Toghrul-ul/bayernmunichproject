package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.AchievementType;
import lombok.Data;

@Data
public class AchievementRequestDto {
    private String title;
    private String year;
    private Long clubId;
    private AchievementType achievementType;
}

