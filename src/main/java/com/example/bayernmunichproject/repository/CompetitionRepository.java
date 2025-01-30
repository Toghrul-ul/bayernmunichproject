package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.CompetitionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetitionRepository extends JpaRepository<CompetitionEntity, Long> {

    List<CompetitionEntity> findByType(String type);

}

//Use case: Retrieve competitions based on their type.
