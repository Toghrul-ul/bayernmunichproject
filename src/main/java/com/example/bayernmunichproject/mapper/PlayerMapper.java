package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.PlayerEntity;
import com.example.bayernmunichproject.model.PlayerDto;
import com.example.bayernmunichproject.model.requestDto.PlayerRequestDto;
import com.example.bayernmunichproject.model.responseDto.PlayerResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface PlayerMapper {
    @Mapping(source = "squad.positionCategory", target = "squadCategory")
    PlayerResponseDto toResponseDto(PlayerEntity entity);

    PlayerEntity toEntity(PlayerRequestDto dto);

    void mapForUpdate(@MappingTarget PlayerEntity entity, PlayerRequestDto dto);
}

//@Mapper(componentModel = "spring")
//public interface PlayerMapper {
//
//    @Mapping(source = "squad.id", target = "squadId")
//    PlayerDto toDto(PlayerEntity entity);
//
//    PlayerEntity toEntity(PlayerDto dto);
//
//    void mapForUpdate(@MappingTarget PlayerEntity entity, PlayerDto dto);
//}

