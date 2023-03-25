package com.music.restful.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.restful.user.dto.UserRequestDto;
import com.music.restful.user.dto.UserResponseDto;
import com.music.restful.user.entity.UserInfo;
import com.music.restful.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping()
	public ResponseEntity<?> createUser(@RequestBody UserRequestDto userRequestDto){
		
		UserInfo userInfo = userService.createUser(userRequestDto);
		UserResponseDto userResponseDto = new UserResponseDto(userInfo);
		
		return new ResponseEntity<>(userResponseDto,HttpStatus.CREATED);
	}
	
}
