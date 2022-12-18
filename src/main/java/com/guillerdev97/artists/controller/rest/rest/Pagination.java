package com.guillerdev97.artists.controller.rest.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Pagination<T> implements Serializable {
    private static final long serialVersionUID = 8851264418522375398L;

    private T[] data;

    private PaginationDetails paginationDetails;
}
