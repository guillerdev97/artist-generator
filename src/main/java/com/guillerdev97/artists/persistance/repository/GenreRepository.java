package com.guillerdev97.artists.persistance.repository;

import com.guillerdev97.artists.persistance.model.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
