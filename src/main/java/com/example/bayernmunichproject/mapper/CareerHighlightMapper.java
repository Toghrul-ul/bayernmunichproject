package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.CareerHighlightEntity;
import com.example.bayernmunichproject.model.CareerHighlightDto;
import com.example.bayernmunichproject.model.requestDto.CareerHighlightRequestDto;
import com.example.bayernmunichproject.model.responseDto.CareerHighlightResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface CareerHighlightMapper {
    @Mapping(source = "player.name", target = "playerName")
    CareerHighlightResponseDto toResponseDto(CareerHighlightEntity entity);

    @Mapping(target = "id", ignore = true)
    CareerHighlightEntity toEntity(CareerHighlightRequestDto dto);

    @Mapping(target = "id", ignore = true)
    void mapForUpdate(@MappingTarget CareerHighlightEntity entity, CareerHighlightRequestDto dto);
}

//@Mapper(componentModel = "spring")
//public interface CareerHighlightMapper {
//
//    @Mapping(source = "player.id", target = "playerId") //
//    CareerHighlightDto toDto(CareerHighlightEntity entity);
//
//    CareerHighlightEntity toEntity(CareerHighlightDto dto);
//
//    void mapForUpdate(@MappingTarget CareerHighlightEntity entity, CareerHighlightDto dto);
//}

