package com.music.restful.user.dto;

import java.util.UUID;

import com.music.restful.user.entity.UserInfo;

public class UserResponseDto  {
	private String id;
	private String address;
	private String phone;
	private UUID uid;
	
	public UserResponseDto(UserInfo userInfo) {
		super();
		this.id = userInfo.getId();
		this.address = userInfo.getAddress();
		this.phone = userInfo.getPhone();
		this.uid = userInfo.getUid();
	}

	public String getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public UUID getUid() {
		return uid;
	}
	
	
	

}
