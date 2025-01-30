package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<ClubEntity, Long> {

    Optional<ClubEntity> findByNameIgnoreCase(String name);

}

//Use case: Allow users to search for a club by name (case insensitive).
