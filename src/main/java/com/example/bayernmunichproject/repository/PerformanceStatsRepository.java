package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.PerformanceStatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerformanceStatsRepository extends JpaRepository<PerformanceStatsEntity, Long> {
    List<PerformanceStatsEntity> findByClubId(Long clubId);

    List<PerformanceStatsEntity> findByCompetitionId(Long competitionId);
}

//Use case: Display team performance in a given league or competition.
