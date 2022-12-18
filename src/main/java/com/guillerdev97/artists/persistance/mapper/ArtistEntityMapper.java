package com.guillerdev97.artists.persistance.mapper;

import com.guillerdev97.artists.persistance.model.ArtistEntity;
import com.guillerdev97.artists.service.dto.ArtistDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArtistEntityMapper {
    ArtistEntity mapToEntity(ArtistDto artistDto);

    ArtistDto mapToDto(ArtistEntity artistEntity);
}
