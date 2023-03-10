package com.guillerdev97.artists;

import com.guillerdev97.artists.persistance.model.ArtistEntity;
import com.guillerdev97.artists.persistance.repository.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class ArtistGeneratorApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ArtistGeneratorApplication.class, args);
	}

	private final ArtistRepository artistRepository;

	@Override
	public void run(String... args) throws Exception {
		ArtistEntity artist01 = ArtistEntity.builder()
				.name("Manuel Carrasco")
				.artisticName("Manuel Carrasco")
				.age(34)
				.genre("Pop")
				.build();

		ArtistEntity artist02 = new ArtistEntity(
				null,
				"Pablo López",
				"Pablo López",
				30,
				"Pop"
		);

		ArtistEntity artist03 = ArtistEntity.builder()
				.name("Rosalía")
				.artisticName("Rosalía")
				.age(29)
				.genre("Latino")
				.build();

		artistRepository.save(artist01);
		artistRepository.save(artist02);
		artistRepository.save(artist03);
	}
}
