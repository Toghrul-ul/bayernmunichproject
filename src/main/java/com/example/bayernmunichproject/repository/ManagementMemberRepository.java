package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.ManagementMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ManagementMemberRepository extends JpaRepository<ManagementMemberEntity, Long> {

    List<ManagementMemberEntity> findByClubId(Long clubId);

    Optional<ManagementMemberEntity> findByRole(String role); // Find managers, coaches, scouts

}

//Use case: Display managers, presidents, directors for a club.
