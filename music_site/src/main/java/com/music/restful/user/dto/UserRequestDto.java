package com.music.restful.user.dto;

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
}
