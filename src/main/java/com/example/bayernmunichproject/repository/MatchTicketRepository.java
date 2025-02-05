package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.MatchTicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MatchTicketRepository extends JpaRepository<MatchTicketEntity, Long> {

    List<MatchTicketEntity> findByMatchId(Long matchId);

}

//Use case: Fetch ticket availability for a specific match.
