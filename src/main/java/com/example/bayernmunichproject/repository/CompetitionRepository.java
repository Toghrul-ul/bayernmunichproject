package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.CompetitionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompetitionRepository extends JpaRepository<CompetitionEntity, Long> {

    List<CompetitionEntity> findByType(String type);

}

//Use case: Retrieve competitions based on their type.
