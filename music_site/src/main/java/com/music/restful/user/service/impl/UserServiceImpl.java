package com.music.restful.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.music.restful.user.dto.UserRequestDto;
import com.music.restful.user.entity.UserInfo;
import com.music.restful.user.repository.UserRepository;
import com.music.restful.user.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserInfo createUser(UserRequestDto userRequestDto) {
		
		UserInfo userInfo = userRequestDto.toEntity();
		
		userInfo = userRepository.save(userInfo);
		return userInfo;
	}
}
