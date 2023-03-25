package com.music.restful.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.restful.user.dto.UserRequestDto;
import com.music.restful.user.entity.UserInfo;
import com.music.restful.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserInfo createUser(UserRequestDto userRequestDto) {
		
		UserInfo userInfo = userRequestDto.toEntity();
		
		userInfo = userRepository.save(userInfo);
		return userInfo;
	}
}
