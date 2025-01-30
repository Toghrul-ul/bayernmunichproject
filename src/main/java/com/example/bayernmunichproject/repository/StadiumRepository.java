package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.StadiumEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StadiumRepository extends JpaRepository<StadiumEntity, Long> {

    Optional<StadiumEntity> findByClubId(Long clubId);

}

//Use case: Get stadium information for a club.
