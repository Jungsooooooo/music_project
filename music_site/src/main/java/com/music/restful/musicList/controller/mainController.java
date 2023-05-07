package com.music.restful.musicList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.restful.musicList.dto.MusicRecommendRequestDto;
import com.music.restful.musicList.service.MusicInfoService;
import com.music.restful.user.dto.UserRequestDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/api/musicMain")
public class mainController {
	
	@Autowired
	private MusicInfoService musicInfoService;
	
	@PostMapping("/write")
	public ResponseEntity<?> musicRecoWrite(@RequestBody MusicRecommendRequestDto musicRecommendDto ){
		return null;
		
	}
}
