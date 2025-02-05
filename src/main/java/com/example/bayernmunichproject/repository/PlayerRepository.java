package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
    Optional<PlayerEntity> findById(Long id);

    Optional<PlayerEntity> findByNameIgnoreCase(String name);

    List<PlayerEntity> findByClubId(Long clubId);

    List<PlayerEntity> findByPosition(String position);
}

//Use case:
//Search for a player by name.
//Get all players from a specific club.
//Filter players by position (defender, midfielder, etc.).
