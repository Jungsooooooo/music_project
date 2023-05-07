package com.music.restful.musicList.dto;

import com.music.restful.user.entity.UserInfo;

public class MusicRecommendResponseDto {
	
	private String title;
	private String info;
	private Double recommended;
	
	private UserInfo userInfo;

	public String getTitle() {
		return title;
	}

	public String getInfo() {
		return info;
	}

	public Double getRecommended() {
		return recommended;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}
	
	
}
