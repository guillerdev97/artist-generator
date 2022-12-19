package com.guillerdev97.artists.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
public class GenreDto implements Serializable {
    private static final long serialVersionUID = 1446831313293041469L;

    private Long id;

    private String name;
}
