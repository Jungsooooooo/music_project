package com.music.restful.user.dto;

import com.music.restful.user.entity.UserInfo;

public class UserResponseDto  {
	private String id;
	private String address;
	private String password;
	private String phone;
	
	public UserResponseDto(UserInfo userInfo) {
		super();
		this.id = userInfo.getId();
		this.address = userInfo.getAddress();
		this.password = userInfo.getPassword();
		this.phone = userInfo.getPhone();
	}

}
