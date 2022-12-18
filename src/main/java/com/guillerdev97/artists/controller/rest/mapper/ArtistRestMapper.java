package com.guillerdev97.artists.controller.rest.mapper;

import com.guillerdev97.artists.controller.rest.rest.ArtistRest;
import com.guillerdev97.artists.service.dto.ArtistDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArtistRestMapper {
    ArtistRest mapToRest(ArtistDto artistDto);

    ArtistDto mapToDto(ArtistRest artistRest);
}
