package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.PlayerStatisticEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PlayerStatisticRepository extends JpaRepository<PlayerStatisticEntity, Long> {

    List<PlayerStatisticEntity> findByPlayerId(Long playerId);

    List<PlayerStatisticEntity> findByCompetitionId(Long competitionId);
}

//Use case:
//Get player stats for a season.
//Compare player performance in different competitions.
