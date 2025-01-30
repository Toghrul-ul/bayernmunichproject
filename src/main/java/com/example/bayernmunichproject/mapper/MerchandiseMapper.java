package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.MerchandiseEntity;
import com.example.bayernmunichproject.model.MerchandiseDto;
import com.example.bayernmunichproject.model.requestDto.MerchandiseRequestDto;
import com.example.bayernmunichproject.model.responseDto.MerchandiseResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface MerchandiseMapper {
    MerchandiseResponseDto toResponseDto(MerchandiseEntity entity);

    MerchandiseEntity toEntity(MerchandiseRequestDto dto);

    void mapForUpdate(@MappingTarget MerchandiseEntity entity, MerchandiseRequestDto dto);
}

//@Mapper(componentModel = "spring")
//public interface MerchandiseMapper {
//
//    MerchandiseDto toDto(MerchandiseEntity entity);
//
//    MerchandiseEntity toEntity(MerchandiseDto dto);
//
//    void mapForUpdate(@MappingTarget MerchandiseEntity entity, MerchandiseDto dto);
//}

