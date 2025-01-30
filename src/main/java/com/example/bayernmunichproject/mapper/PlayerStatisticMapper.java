package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.PlayerStatisticEntity;
import com.example.bayernmunichproject.model.PlayerStatisticDto;
import com.example.bayernmunichproject.model.requestDto.PlayerStatisticRequestDto;
import com.example.bayernmunichproject.model.responseDto.PlayerStatisticResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PlayerStatisticMapper {
    @Mapping(source = "player.name", target = "playerName")
    PlayerStatisticResponseDto toResponseDto(PlayerStatisticEntity entity);

    PlayerStatisticEntity toEntity(PlayerStatisticRequestDto dto);

    void mapForUpdate(@MappingTarget PlayerStatisticEntity entity, PlayerStatisticRequestDto dto);
}

//@Mapper(componentModel = "spring")
//public interface PlayerStatisticMapper {
//
//    @Mapping(source = "player.id", target = "playerId")
//    PlayerStatisticDto toDto(PlayerStatisticEntity entity);
//
//    PlayerStatisticEntity toEntity(PlayerStatisticDto dto);
//
//    void mapForUpdate(@MappingTarget PlayerStatisticEntity entity, PlayerStatisticDto dto);
//}

