package com.guillerdev97.artists.controller.rest.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenreRest implements Serializable {
    private static final long serialVersionUID = 5963452837006644092L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;
}
