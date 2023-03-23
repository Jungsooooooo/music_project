package com.music.restful.user.service;

import com.music.restful.user.dto.UserRequestDto;
import com.music.restful.user.entity.UserInfo;

public interface UserService {
	
	public UserInfo createUser(UserRequestDto userRequestDto);
}
