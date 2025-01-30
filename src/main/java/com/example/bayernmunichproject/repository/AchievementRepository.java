package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.AchievementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AchievementRepository extends JpaRepository<AchievementEntity, Long> {

    List<AchievementEntity> findByClubId(Long clubId);

    List<AchievementEntity> findByYear(String year);
}

//Use case: Fetch all achievements for a given club.