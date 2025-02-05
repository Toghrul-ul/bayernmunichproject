package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.ClubEntity;
import com.example.bayernmunichproject.model.requestDto.ClubRequestDto;
import com.example.bayernmunichproject.model.responseDto.ClubResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface ClubMapper {
//    @Mapping(source = "stadium.name", target = "stadiumName")
    ClubResponseDto toClubResponseDto(ClubEntity entity);

    ClubEntity toClubEntity(ClubRequestDto dto);

    void mapForUpdate(ClubRequestDto dto, @MappingTarget ClubEntity entity);
}

//@Mapper(componentModel = "spring")
//public interface ClubMapper {
//
//    @Mapping(source = "stadium.id", target = "stadiumId")
//    ClubDto toDto(ClubEntity entity);
//
//    ClubEntity toEntity(ClubDto dto);
//
//    void mapForUpdate(@MappingTarget ClubEntity entity, ClubDto dto);
//}

