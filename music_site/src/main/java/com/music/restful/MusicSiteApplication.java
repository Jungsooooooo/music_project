package com.music.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MusicSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicSiteApplication.class, args);
	}

}
