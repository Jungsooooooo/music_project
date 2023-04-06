package com.music.restful.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.restful.user.dto.UserRequestDto;
import com.music.restful.user.entity.UserInfo;
import com.music.restful.user.repository.UserRepository;
import com.music.restful.user.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserInfo createUser(UserRequestDto userRequestDto) {
		
		UserInfo userInfo = userRequestDto.toEntity();
		
		userInfo = userRepository.save(userInfo);
		return userInfo;
	}

	@Override
	public boolean existsById(String id) {
		return userRepository.existsById(id);
	}
	
	@Override
	public UserInfo loginUser(UserRequestDto userRequestDto) {
		// TODO Auto-generated method stub
		String id = userRequestDto.getId();
		String password = userRequestDto.getPassword();
		return userRepository.findByIdAndPassword(id, password );
	}
}
