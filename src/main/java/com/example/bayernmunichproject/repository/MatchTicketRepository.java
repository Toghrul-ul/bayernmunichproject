package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.MatchTicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchTicketRepository extends JpaRepository<MatchTicketEntity, Long> {

    List<MatchTicketEntity> findByMatchId(Long matchId);

}

//Use case: Fetch ticket availability for a specific match.
