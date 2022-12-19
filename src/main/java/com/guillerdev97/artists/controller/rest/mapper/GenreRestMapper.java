package com.guillerdev97.artists.controller.rest.mapper;

import com.guillerdev97.artists.controller.rest.rest.GenreRest;
import com.guillerdev97.artists.service.dto.GenreDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreRestMapper {
    GenreRest mapToRest(GenreDto genreDto);

    GenreDto mapToDto(GenreRest genreRest);
}
