package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.SquadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SquadRepository extends JpaRepository<SquadEntity, Long> {

    List<SquadEntity> findByClubId(Long clubId);

    List<SquadEntity> findBySeason(String season);
}

//Use case: Show a club’s squad for a specific season.