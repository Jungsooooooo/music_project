package com.music.restful.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.restful.user.dto.UserRequestDto;
import com.music.restful.user.entity.UserInfo;
import com.music.restful.user.repository.UserRepository;


public interface UserService {

	public UserInfo createUser(UserRequestDto userRequestDto);
	
	public boolean existsById(String id); 
	
	
	public UserInfo loginUser(UserRequestDto userRequestDto);
		
}
