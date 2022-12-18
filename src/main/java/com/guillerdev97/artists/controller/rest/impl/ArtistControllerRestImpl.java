package com.guillerdev97.artists.controller.rest.impl;

import com.guillerdev97.artists.controller.rest.ArtistControllerRest;
import com.guillerdev97.artists.controller.rest.mapper.ArtistRestMapper;
import com.guillerdev97.artists.controller.rest.rest.ArtistRest;
import com.guillerdev97.artists.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(value = "*")
@RequiredArgsConstructor
public class ArtistControllerRestImpl implements ArtistControllerRest {
    private final ArtistService artistService;

    private final ArtistRestMapper artistRestMapper;

    @Override
    @GetMapping("/artist")
    public List<ArtistRest> getAllArtists() {
        return artistService.getAllArtists().stream().map(artistRestMapper::mapToRest).collect(Collectors.toList());
    }
}
