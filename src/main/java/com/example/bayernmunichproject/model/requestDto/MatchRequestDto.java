package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.MatchResult;
import com.example.bayernmunichproject.enums.MatchType;

import java.time.LocalDateTime;

public class MatchRequestDto {
    private String opponent;
    private LocalDateTime matchDateTime;
    private String location;
    private Long homeClubId;
    private Long awayClubId;
    private Long competitionId;
    private MatchResult matchResult;
    private MatchType matchType;
}

