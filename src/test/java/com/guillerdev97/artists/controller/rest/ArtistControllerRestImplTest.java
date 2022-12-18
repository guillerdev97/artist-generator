package com.guillerdev97.artists.controller.rest;

import com.guillerdev97.artists.controller.rest.impl.ArtistControllerRestImpl;
import com.guillerdev97.artists.controller.rest.mapper.ArtistRestMapper;
import com.guillerdev97.artists.controller.rest.rest.ArtistRest;
import com.guillerdev97.artists.service.ArtistService;
import com.guillerdev97.artists.service.dto.ArtistDto;
import org.junit.jupiter.api.Assertions;
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

@ExtendWith(MockitoExtension.class)
class ArtistControllerRestImplTest {
    private ArtistRest artistRest;

    private ArtistDto artistDto;

    @Mock
    private ArtistService artistService;

    @Mock
    private ArtistRestMapper artistRestMapper;

    @InjectMocks
    private ArtistControllerRestImpl artistControllerRestImpl;

    @BeforeEach
    public void setup() {
        artistRest = ArtistRest.builder()
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
        List<ArtistDto> dtoList = Collections.singletonList(artistDto);

        // when
        Mockito.when(artistService.getAllArtists()).thenReturn(dtoList);
        Mockito.when(artistRestMapper.mapToRest(ArgumentMatchers.any(ArtistDto.class))).thenReturn(artistRest);

        // then
        List<ArtistRest> response = artistControllerRestImpl.getAllArtists();

        // assertions
        Assertions.assertNotNull(response);
        Assertions.assertEquals(1, response.size());
        Assertions.assertEquals(1L, response.get(0).getId());
    }
}
