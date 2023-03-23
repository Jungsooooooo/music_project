package com.music.restful.user.dto;

import com.music.restful.user.entity.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class UserRequestDto {
	
	private String id;
	private String address;
	private String password;
	private String phone;
	
	public UserInfo toEntity() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(id);
		userInfo.setAddress(address);
		userInfo.setPassword(password);
		userInfo.setPhone(phone);
		
		return userInfo;
	}
}
