package com.example.demo;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.music.restful.MusicSiteApplication;
import com.music.restful.musicList.entity.MusicInfo;
import com.music.restful.musicList.repository.MusicMainRepository;

@SpringBootTest(classes = MusicSiteApplication.class)
class MusicSiteApplicationTests {
	@Autowired
	MusicMainRepository musicMainRepository;

	@Test
	void contextLoads() {
		
		
	}

}
