package com.guillerdev97.artists.controller.rest.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArtistRest implements Serializable {
    private static final long serialVersionUID = -8929646420157473763L;

    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "artistic_name")
    private String artisticName;

    @JsonProperty(value = "age")
    private Integer age;

    @JsonProperty(value = "genre")
    private String genre;

    @JsonProperty(value = "awards")
    private List<String> awards;
}
