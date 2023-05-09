package com.music.restful.musicList.dto;

import com.music.restful.musicList.entity.MusicInfo;
import com.music.restful.user.entity.UserInfo;

public class MusicRecommendResponseDto {
	
	private String title;
	private String info;
	private Double recommended;
	private String genre;
	
	private UserInfo userInfo;

	public MusicRecommendResponseDto(MusicInfo musicInfo) {
		this.title =musicInfo.getTitle();
		this.info =musicInfo.getInfo();
		this.recommended =musicInfo.getRecommended();
		this.genre =musicInfo.getGenre();
	}

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

	public String getGenre() {
		return genre;
	}
	
	
	
}
