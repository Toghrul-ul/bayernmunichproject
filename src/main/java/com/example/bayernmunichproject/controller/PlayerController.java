package com.example.bayernmunichproject.controller;

import com.example.bayernmunichproject.model.requestDto.ClubRequestDto;
import com.example.bayernmunichproject.model.requestDto.PlayerRequestDto;
import com.example.bayernmunichproject.model.responseDto.ClubResponseDto;
import com.example.bayernmunichproject.model.responseDto.PlayerResponseDto;
import com.example.bayernmunichproject.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping
    public List<PlayerResponseDto> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/{playerId}")
    public PlayerResponseDto getPlayer(@PathVariable Long playerId) {
        return playerService.getPlayer(playerId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void savePlayer(@RequestBody PlayerRequestDto requestDto) {
        playerService.savePlayer(requestDto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{playerId}")
    public void updatePlayer(@PathVariable Long playerId, @RequestBody PlayerRequestDto requestDto) {
        playerService.updatePlayer(playerId, requestDto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{playerId}")
    public void deleteClub(@PathVariable Long playerId) {
        playerService.deletePlayer(playerId);
    }
}
