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
	private String password;
	private String address;
	private String phone;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public UserInfo toEntity() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(id);
		userInfo.setAddress(address);
		userInfo.setPassword(password);
		userInfo.setPhone(phone);
		
		return userInfo;
	}
	
	
}
