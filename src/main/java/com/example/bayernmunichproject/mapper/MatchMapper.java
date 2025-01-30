package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.MatchEntity;
import com.example.bayernmunichproject.model.MatchDto;
import com.example.bayernmunichproject.model.requestDto.MatchRequestDto;
import com.example.bayernmunichproject.model.responseDto.MatchResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface MatchMapper {
    @Mapping(source = "homeClub.name", target = "homeClubName")
    @Mapping(source = "awayClub.name", target = "awayClubName")
    @Mapping(source = "competition.name", target = "competitionName")
    MatchResponseDto toResponseDto(MatchEntity entity);

    @Mapping(target = "id", ignore = true)
    MatchEntity toEntity(MatchRequestDto dto);

    @Mapping(target = "id", ignore = true)
    void mapForUpdate(@MappingTarget MatchEntity entity, MatchRequestDto dto);
}

//@Mapper(componentModel = "spring")
//public interface MatchMapper {
//
//    @Mapping(source = "homeClub.id", target = "homeClubId")
//    @Mapping(source = "awayClub.id", target = "awayClubId")
//    @Mapping(source = "competition.id", target = "competitionId")
//    MatchDto toDto(MatchEntity entity);
//
//    MatchEntity toEntity(MatchDto dto);
//
//    void mapForUpdate(@MappingTarget MatchEntity entity, MatchDto dto);
//}

