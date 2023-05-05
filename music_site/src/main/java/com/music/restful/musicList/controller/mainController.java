package com.music.restful.musicList.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.restful.musicList.dto.MusicRecommendDto;
import com.music.restful.user.dto.UserRequestDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/api/musicMain")
public class mainController {
	
	
	@PostMapping("/write")
	public ResponseEntity<?> musicRecoWrite(@RequestBody MusicRecommendDto musicRecommendDto ){
		return null;
		
	}
}
