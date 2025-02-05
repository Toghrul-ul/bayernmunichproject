package com.example.bayernmunichproject.service.impl;

import com.example.bayernmunichproject.dao.ClubEntity;
import com.example.bayernmunichproject.exception.NotFoundException;
import com.example.bayernmunichproject.mapper.ClubMapper;
import com.example.bayernmunichproject.model.requestDto.ClubRequestDto;
import com.example.bayernmunichproject.model.responseDto.ClubResponseDto;
import com.example.bayernmunichproject.repository.ClubRepository;
import com.example.bayernmunichproject.service.ClubService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;
    private final ClubMapper clubMapper;
//    private final AchievementRepository achievementRepository;
//    private final StadiumRepository stadiumRepository;
//    private final LeagueStandingRepository leagueStandingRepository;
//    private final PerformanceStatsRepository performanceStatsRepository;
//    private final AchievementMapper achievementMapper;
//    private final LeagueStandingMapper leagueStandingMapper;
//    private final PerformanceStatsMapper performanceStatsMapper;

    @Override
    public ClubResponseDto getClub(Long id) {
        ClubEntity clubEntity = clubRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Club not found with ID: " + id));
        log.info("Fetching club with ID: {}", id);
        return clubMapper.toClubResponseDto(clubEntity);
    }

    @Override
    public List<ClubResponseDto> getClubs() {
        log.info("Fetching all clubs");
        return clubRepository.findAll().stream()
                .map(clubMapper::toClubResponseDto)
                .toList();
    }

    @Override
    public void saveClub(ClubRequestDto clubRequestDto) {
        ClubEntity clubEntity = clubMapper.toClubEntity(clubRequestDto);
        clubRepository.save(clubEntity);
        log.info("Saving new club: {}", clubEntity.getName());
    }

    @Override
    public void updateClub( Long id,ClubRequestDto clubRequestDto) {
        log.info("Updating club with ID: {}", id);
        ClubEntity existingClub = clubRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Club not found with ID: " + id));
        clubMapper.mapForUpdate(clubRequestDto, existingClub);
        clubRepository.save(existingClub);
        log.info("Updated club with ID: {}", id);
    }

    @Override
    public void deleteClub(Long id) {
        log.info("Deleting club with ID: {}", id);
        if (!clubRepository.existsById(id)) {
            throw new EntityNotFoundException("Club not found with ID: " + id);
        }
        clubRepository.deleteById(id);
        log.info("Deleted club with ID: {}", id);
    }
//
//    @Override
//    public ClubDto assignAchievementToClub(Long clubId, Long achievementId) {
//        log.info("Assigning achievement ID {} to club ID {}", achievementId, clubId);
//        ClubEntity clubEntity = clubRepository.findById(clubId)
//                .orElseThrow(() -> new EntityNotFoundException("Club not found with ID: " + clubId));
//        AchievementEntity achievementEntity = achievementRepository.findById(achievementId)
//                .orElseThrow(() -> new EntityNotFoundException("Achievement not found with ID: " + achievementId));
//        clubEntity.getAchievements().add(achievementEntity);
//        clubRepository.save(clubEntity);
//        return clubMapper.toDto(clubEntity);
//    }
//
//    @Override
//    public ClubDto linkStadiumToClub(Long clubId, Long stadiumId) {
//        log.info("Linking stadium ID {} to club ID {}", stadiumId, clubId);
//        ClubEntity clubEntity = clubRepository.findById(clubId)
//                .orElseThrow(() -> new EntityNotFoundException("Club not found with ID: " + clubId));
//        StadiumEntity stadiumEntity = stadiumRepository.findById(stadiumId)
//                .orElseThrow(() -> new EntityNotFoundException("Stadium not found with ID: " + stadiumId));
//        clubEntity.setStadium(stadiumEntity);
//        clubRepository.save(clubEntity);
//        return clubMapper.toDto(clubEntity);
//    }
//
//    @Override
//    public LeagueStandingDto getLeagueStanding(Long clubId) {
//        log.info("Fetching league standing for club ID {}", clubId);
//        LeagueStandingEntity leagueStanding = leagueStandingRepository.findByClubId(clubId)
//                .orElseThrow(() -> new EntityNotFoundException("League standing not found for club ID: " + clubId));
//        return leagueStandingMapper.toDto(leagueStanding);
//    }
//
//    @Override
//    public List<PerformanceStatsDto> getPerformanceStats(Long clubId) {
//        log.info("Fetching performance stats for club ID {}", clubId);
//        return performanceStatsRepository.findByClubId(clubId).stream()
//                .map(performanceStatsMapper::toDto)
//                .toList();
//     }
}

