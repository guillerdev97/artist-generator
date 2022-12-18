package com.guillerdev97.artists.service.impl;

import com.guillerdev97.artists.persistance.mapper.ArtistEntityMapper;
import com.guillerdev97.artists.persistance.model.ArtistEntity;
import com.guillerdev97.artists.persistance.repository.ArtistRepository;
import com.guillerdev97.artists.service.ArtistService;
import com.guillerdev97.artists.service.dto.ArtistDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArtistServiceImplTest {
    private ArtistEntity artistEntity;

    private ArtistDto artistDto;

    @Mock
    private ArtistRepository artistRepository;

    @Mock
    private ArtistEntityMapper artistEntityMapper;

    @InjectMocks
    private ArtistServiceImpl artistService;

    @BeforeEach
    public void setup() {
        artistEntity = ArtistEntity.builder()
                .id(1L)
                .name("Manuel Carrasco")
                .build();

        artistDto = ArtistDto.builder()
                .id(1L)
                .name("Manuel Carrasco")
                .build();
    }
    @Test
    void getAllArtistsTest() {
        // given
        List<ArtistEntity> entityList = Collections.singletonList(artistEntity);

        // when
        Mockito.when(artistRepository.findAll()).thenReturn(entityList);
        Mockito.when(artistEntityMapper.mapToDto(ArgumentMatchers.any(ArtistEntity.class))).thenReturn(artistDto);

        // then
        List<ArtistDto> response = artistService.getAllArtists();

        // assertions
        assertNotNull(response);
        assertEquals(1, response.size());
        assertEquals("Manuel Carrasco", response.get(0).getName());
        assertEquals(ArtistDto.class, response.get(0).getClass());

        System.out.println("Test 1 passed: Get all artists of service");
    }
}