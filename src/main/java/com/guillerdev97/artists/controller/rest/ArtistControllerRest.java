package com.guillerdev97.artists.controller.rest;

import com.guillerdev97.artists.controller.rest.rest.ArtistRest;
import com.guillerdev97.artists.controller.rest.rest.Pagination;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArtistControllerRest {
    Pagination<ArtistRest> getAllArtists(Pageable pageable);
}
