package com.example.bayernmunichproject.mapper;

import com.example.bayernmunichproject.dao.PlayerEntity;
import com.example.bayernmunichproject.dao.SquadEntity;
import com.example.bayernmunichproject.model.requestDto.PlayerRequestDto;
import com.example.bayernmunichproject.model.responseDto.PlayerResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;


@Mapper(componentModel = "spring")
public interface PlayerMapper {


    @Mapping(source = "squad.positionCategory", target = "squadCategory")
    PlayerResponseDto toPlayerResponseDto(PlayerEntity playerEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "position", ignore = true)
    @Mapping(target = "statistics", ignore = true)
    @Mapping(target = "careerHighlights", ignore = true)
    @Mapping(target = "shirtNumber", ignore = true)
    @Mapping(target = "contractEndDate", ignore = true)
    @Mapping(source = "squadId", target = "squad", qualifiedByName = "mapSquad")
    PlayerEntity toPlayerEntity(PlayerRequestDto playerRequestDto);


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "position", ignore = true)
    @Mapping(target = "statistics", ignore = true)
    @Mapping(target = "careerHighlights", ignore = true)
    @Mapping(target = "squad", ignore = true)
    @Mapping(target = "shirtNumber", ignore = true)
    @Mapping(target = "contractEndDate", ignore = true)
    void mapForUpdate(PlayerRequestDto playerRequestDto, @MappingTarget PlayerEntity playerEntity);

    

    @Named("mapSquad")
    default SquadEntity mapSquad(Long squadId) {
        if (squadId == null) {
            return null;
        }
        SquadEntity squad = new SquadEntity();
        squad.setId(squadId);
        return squad;
    }

}


