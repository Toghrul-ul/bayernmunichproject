package com.example.bayernmunichproject.service;

import com.example.bayernmunichproject.model.ClubDto;
import com.example.bayernmunichproject.model.LeagueStandingDto;
import com.example.bayernmunichproject.model.PerformanceStatsDto;
import com.example.bayernmunichproject.model.requestDto.ClubRequestDto;
import com.example.bayernmunichproject.model.responseDto.ClubResponseDto;

import java.util.List;

public interface ClubService {
    ClubResponseDto getClub(Long id);
    List<ClubResponseDto> getClubs();
    void saveClub(ClubRequestDto clubRequestDto);
    void updateClub(Long id, ClubRequestDto clubRequestDto);
    void deleteClub(Long id);
//
//    ClubDto assignAchievementToClub(Long clubId, Long achievementId);
//    ClubDto linkStadiumToClub(Long clubId, Long stadiumId);
//    LeagueStandingDto getLeagueStanding(Long clubId);
//    List<PerformanceStatsDto> getPerformanceStats(Long clubId);
}

