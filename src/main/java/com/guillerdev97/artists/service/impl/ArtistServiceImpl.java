package com.guillerdev97.artists.service.impl;

import com.guillerdev97.artists.persistance.mapper.ArtistEntityMapper;
import com.guillerdev97.artists.persistance.repository.ArtistRepository;
import com.guillerdev97.artists.service.ArtistService;
import com.guillerdev97.artists.service.dto.ArtistDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {
    private final ArtistRepository artistRepository;

    private final ArtistEntityMapper artistEntityMapper;

    @Override
    public Page<ArtistDto> getAllArtists(Pageable pageable) {
        return artistRepository.findAll(pageable).map(artistEntityMapper::mapToDto);
    }
}
