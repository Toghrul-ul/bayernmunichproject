package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.LeagueStandingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LeagueStandingRepository extends JpaRepository<LeagueStandingEntity, Long> {

    Optional<LeagueStandingEntity> findByClubIdAndSeason(Long clubId, String season);  // I added it

    List<LeagueStandingEntity> findByCompetitionIdOrderByPointsDesc(Long competitionId);
}

//Use case: Show the league table sorted by points.
