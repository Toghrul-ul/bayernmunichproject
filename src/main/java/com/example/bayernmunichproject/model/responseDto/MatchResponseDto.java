package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.MatchResult;
import com.example.bayernmunichproject.enums.MatchType;

import java.time.LocalDateTime;

public class MatchResponseDto {
    private Long id;
    private String opponent;
    private LocalDateTime matchDateTime;
    private String location;
    private String homeClubName;
    private String awayClubName;
    private String competitionName;
    private MatchResult matchResult;
    private MatchType matchType;
    private String score;
    private Integer attendance;
    private String refereeName;
}

