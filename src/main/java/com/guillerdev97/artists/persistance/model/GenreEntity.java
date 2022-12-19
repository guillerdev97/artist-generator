package com.guillerdev97.artists.persistance.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genres")
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GenreEntity extends HiddenData {
    private static final long serialVersionUID = -29000941612168871L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ArtistEntity> artistList;
}
