package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.CareerHighlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CareerHighlightRepository extends JpaRepository<CareerHighlightEntity, Long> {

    List<CareerHighlightEntity> findByPlayerId(Long playerId);

}

//Use case: Get all career highlights for a specific player.
