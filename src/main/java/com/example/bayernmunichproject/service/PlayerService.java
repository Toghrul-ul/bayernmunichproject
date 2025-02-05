package com.example.bayernmunichproject.service;

import com.example.bayernmunichproject.model.requestDto.PlayerRequestDto;
import com.example.bayernmunichproject.model.responseDto.PlayerResponseDto;

import java.util.List;

public interface PlayerService {
    PlayerResponseDto getPlayer(Long id);
    List<PlayerResponseDto> getPlayers();
    void savePlayer(PlayerRequestDto playerRequestDto);
    void updatePlayer(Long id, PlayerRequestDto playerRequestDto);
    void deletePlayer(Long id);
}
