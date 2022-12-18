package com.guillerdev97.artists.controller.rest.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class PaginationDetails implements Serializable {
    private static final long serialVersionUID = -6277467892675718617L;

    private Integer currentPage;

    private Integer pageSize;

    private Integer totalPages;
}
