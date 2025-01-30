package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.SquadEntity;
import com.example.bayernmunichproject.model.SquadDto;
import com.example.bayernmunichproject.model.requestDto.SquadRequestDto;
import com.example.bayernmunichproject.model.responseDto.SquadResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface SquadMapper {
    @Mapping(source = "club.name", target = "clubName")
    SquadResponseDto toResponseDto(SquadEntity entity);

    SquadEntity toEntity(SquadRequestDto dto);

    void mapForUpdate(@MappingTarget SquadEntity entity, SquadRequestDto dto);
}

//@Mapper(componentModel = "spring")
//public interface SquadMapper {
//
//    @Mapping(source = "club.id", target = "clubId")
//    SquadDto toDto(SquadEntity entity);
//
//    SquadEntity toEntity(SquadDto dto);
//
//    void mapForUpdate(@MappingTarget SquadEntity entity, SquadDto dto);
//}

