package com.guillerdev97.artists.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class ArtistDto implements Serializable {
    private static final long serialVersionUID = -2665741526206850535L;

    private Long id;

    private String name;

    private String artisticName;

    private Integer age;

    private String genre;
}
