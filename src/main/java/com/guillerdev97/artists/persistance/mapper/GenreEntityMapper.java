package com.guillerdev97.artists.persistance.mapper;

import com.guillerdev97.artists.persistance.model.GenreEntity;
import com.guillerdev97.artists.service.dto.GenreDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreEntityMapper {
    GenreEntity mapToEntity(GenreDto genreDto);

    GenreDto mapToDto(GenreEntity genreEntity);
}
