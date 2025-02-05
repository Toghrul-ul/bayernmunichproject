package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.LeagueStandingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface LeagueStandingRepository extends JpaRepository<LeagueStandingEntity, Long> {

    Optional<LeagueStandingEntity> findByClubIdAndSeason(Long clubId, String season);  // I added it

    List<LeagueStandingEntity> findByCompetitionIdOrderByPointsDesc(Long competitionId);
}

//Use case: Show the league table sorted by points.
