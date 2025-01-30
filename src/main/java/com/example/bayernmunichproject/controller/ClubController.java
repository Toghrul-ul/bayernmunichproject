package com.example.bayernmunichproject.controller;

import com.example.bayernmunichproject.model.ClubDto;
import com.example.bayernmunichproject.model.LeagueStandingDto;
import com.example.bayernmunichproject.model.PerformanceStatsDto;
import com.example.bayernmunichproject.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
@RequiredArgsConstructor
public class ClubController {

    private final ClubService clubService;

    @GetMapping
    public List<ClubDto> getClubs() {
        return clubService.getClubs();
    }

    @GetMapping("/{clubId}")
    public ClubDto getClub(@PathVariable Long clubId) {
        return clubService.getClub(clubId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveClub(@RequestBody ClubDto clubDto) {
        clubService.saveClub(clubDto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{clubId}")
    public void editClub(@RequestBody ClubDto clubDto, @PathVariable Long clubId) {
        clubService.editClub(clubDto, clubId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{clubId}")
    public void deleteClub(@PathVariable Long clubId) {
        clubService.deleteClub(clubId);
    }

    @PutMapping("/{clubId}/assign-achievement/{achievementId}")
    public ClubDto assignAchievementToClub(@PathVariable Long clubId, @PathVariable Long achievementId) {
        return clubService.assignAchievementToClub(clubId, achievementId);
    }

    @PutMapping("/{clubId}/link-stadium/{stadiumId}")
    public ClubDto linkStadiumToClub(@PathVariable Long clubId, @PathVariable Long stadiumId) {
        return clubService.linkStadiumToClub(clubId, stadiumId);
    }

    @GetMapping("/{clubId}/league-standing")
    public LeagueStandingDto getLeagueStanding(@PathVariable Long clubId) {
        return clubService.getLeagueStanding(clubId);
    }

    @GetMapping("/{clubId}/performance-stats")
    public List<PerformanceStatsDto> getPerformanceStats(@PathVariable Long clubId) {
        return clubService.getPerformanceStats(clubId);
    }
}
