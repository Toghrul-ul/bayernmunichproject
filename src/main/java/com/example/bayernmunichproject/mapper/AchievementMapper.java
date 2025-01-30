package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.AchievementEntity;
import com.example.bayernmunichproject.model.AchievementDto;
import com.example.bayernmunichproject.model.requestDto.AchievementRequestDto;
import com.example.bayernmunichproject.model.responseDto.AchievementResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface AchievementMapper {
    @Mapping(source = "club.name", target = "clubName")
    AchievementResponseDto toResponseDto(AchievementEntity entity);

    @Mapping(target = "id", ignore = true)
    AchievementEntity toEntity(AchievementRequestDto dto);

    @Mapping(target = "id", ignore = true)
    void mapForUpdate(@MappingTarget AchievementEntity entity, AchievementRequestDto dto);
}

//@Mapper(componentModel = "spring")
//public interface AchievementMapper {
//
//    @Mapping(source = "club.id", target = "clubId")
//    AchievementDto toDto(AchievementEntity achievementEntity);
//
//    AchievementEntity toEntity(AchievementDto achievementDTO);
//
//    void mapForUpdate(@MappingTarget AchievementEntity achievementEntity, AchievementDto achievementDto);
//}

