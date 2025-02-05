package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClubRepository extends JpaRepository<ClubEntity, Long> {

    Optional<ClubEntity> findByNameIgnoreCase(String name);

}

//Use case: Allow users to search for a club by name (case insensitive).
