package com.guillerdev97.artists.controller.rest.impl;

import com.guillerdev97.artists.controller.rest.ArtistControllerRest;
import com.guillerdev97.artists.controller.rest.mapper.ArtistRestMapper;
import com.guillerdev97.artists.controller.rest.rest.ArtistRest;
import com.guillerdev97.artists.controller.rest.rest.Pagination;
import com.guillerdev97.artists.controller.rest.rest.PaginationDetails;
import com.guillerdev97.artists.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "*")
@RequiredArgsConstructor
public class ArtistControllerRestImpl implements ArtistControllerRest {
    private final ArtistService artistService;

    private final ArtistRestMapper artistRestMapper;

    @Override
    @GetMapping("/artist")
    public Pagination<ArtistRest> getAllArtists(final Pageable pageable) {
       Page<ArtistRest> restPage = artistService.getAllArtists(pageable).map(artistRestMapper::mapToRest);

       return new Pagination<>(
               restPage.getContent().toArray(new ArtistRest[]{}),
               new PaginationDetails(restPage.getNumber(),
                       pageable.getPageSize(),
                       restPage.getTotalPages())
       );
    }
}
