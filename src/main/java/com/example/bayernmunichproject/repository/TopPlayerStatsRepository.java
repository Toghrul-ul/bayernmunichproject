package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.TopPlayerStatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopPlayerStatsRepository extends JpaRepository<TopPlayerStatsEntity, Long> {

    List<TopPlayerStatsEntity> findByCompetitionIdOrderByGoalsDesc(Long competitionId);

    List<TopPlayerStatsEntity> findByCompetitionIdOrderByAssistsDesc(Long competitionId);

}

//Use case:
//Show top goal scorers in a league.
//Show top assist providers in a league.
