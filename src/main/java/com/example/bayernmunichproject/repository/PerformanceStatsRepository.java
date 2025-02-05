package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.PerformanceStatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerformanceStatsRepository extends JpaRepository<PerformanceStatsEntity, Long> {
    List<PerformanceStatsEntity> findByClubId(Long clubId);

    List<PerformanceStatsEntity> findByCompetitionId(Long competitionId);
}

//Use case: Display team performance in a given league or competition.
