package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.PlayerStatisticEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerStatisticRepository extends JpaRepository<PlayerStatisticEntity, Long> {

    List<PlayerStatisticEntity> findByPlayerId(Long playerId);

    List<PlayerStatisticEntity> findByCompetitionId(Long competitionId);
}

//Use case:
//Get player stats for a season.
//Compare player performance in different competitions.
