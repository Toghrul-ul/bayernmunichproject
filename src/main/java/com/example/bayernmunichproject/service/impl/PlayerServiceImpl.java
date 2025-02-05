package com.example.bayernmunichproject.service.impl;

import com.example.bayernmunichproject.dao.PlayerEntity;
import com.example.bayernmunichproject.exception.NotFoundException;
import com.example.bayernmunichproject.mapper.ClubMapperImpl;
import com.example.bayernmunichproject.mapper.PlayerMapper;
import com.example.bayernmunichproject.model.requestDto.PlayerRequestDto;
import com.example.bayernmunichproject.model.responseDto.PlayerResponseDto;
import com.example.bayernmunichproject.repository.PlayerRepository;
import com.example.bayernmunichproject.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;


    @Override
    public PlayerResponseDto getPlayer(Long id) {
        PlayerEntity playerEntity = playerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Player not found with ID: " + id));
        return playerMapper.toPlayerResponseDto(playerEntity);
    }

    @Override
    public List<PlayerResponseDto> getPlayers() {
        return playerRepository.findAll().stream()
                .map(playerMapper::toPlayerResponseDto)
                .toList();
    }

    @Override
    public void savePlayer(PlayerRequestDto playerRequestDto) {
        PlayerEntity playerEntity = playerMapper.toPlayerEntity(playerRequestDto);
        playerRepository.save(playerEntity);
        log.info("Saving new club: {}", playerEntity.getName());
    }

    @Override
    public void updatePlayer(Long id, PlayerRequestDto playerRequestDto) {
        PlayerEntity existingEntity = playerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Player not found with ID: " + id));
        playerMapper.mapForUpdate(playerRequestDto, existingEntity);
        PlayerEntity updatedEntity = playerRepository.save(existingEntity);
        playerMapper.toPlayerResponseDto(updatedEntity);
        ;
    }

    @Override
    public void deletePlayer(Long id) {
        PlayerEntity playerEntity = playerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Player not found with ID: " + id));
        playerRepository.delete(playerEntity);

    }
}
