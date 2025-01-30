package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.CareerHighlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CareerHighlightRepository extends JpaRepository<CareerHighlightEntity, Long> {

    List<CareerHighlightEntity> findByPlayerId(Long playerId);

}

//Use case: Get all career highlights for a specific player.
