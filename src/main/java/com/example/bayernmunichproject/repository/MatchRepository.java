package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Long> {
    List<MatchEntity> findByCompetitionId(Long competitionId);

    List<MatchEntity> findByDateAfter(LocalDate date); // Upcoming matches

    List<MatchEntity> findByDateBefore(LocalDate date);
}

//Use case: Retrieve matches based on competition and time.
