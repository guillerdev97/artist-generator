package com.guillerdev97.artists.persistance.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "artists")
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtistEntity extends HiddenData {
    private static final long serialVersionUID = 7023595111032243276L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "artistic_name")
    private String artisticName;

    @Column(name = "age")
    private Integer age;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "genre_id")
    private GenreEntity genre;
}
