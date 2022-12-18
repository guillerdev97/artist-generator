package com.guillerdev97.artists.service;

import com.guillerdev97.artists.service.dto.ArtistDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ArtistService {
    Page<ArtistDto> getAllArtists(Pageable pageable);
}
