package com.music.restful.musicList.dto;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.music.restful.musicList.entity.MusicInfo;
import com.music.restful.user.entity.UserInfo;
import com.music.restful.user.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class MusicRecommendRequestDto {
	
	@Autowired
	private UserRepository userRepository;
	
	private String title;
	private String info;
	private Double recommended;
	private String genre;
	
	private String userUUID;
	
	private UserInfo userInfo;
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
	
	public Double getRecommended() {
		return recommended;
	}
	
	public void setRecommended(Double recommended) {
		this.recommended = recommended;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getUserUUID() {
		return userUUID;
	}
	
	public void setUserUUID(String userUid) {
		this.userUUID = userUid;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}
	
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public MusicInfo toEntity() {
		MusicInfo musicInfo = new MusicInfo();
		Optional<UserInfo> userInfo = userRepository.findById(UUID.fromString(userUUID));
		
		musicInfo.setTitle(title);
		musicInfo.setInfo(info);
		musicInfo.setRecommended(recommended);
		musicInfo.setGenre(genre);
		musicInfo.setUserInfo(userInfo.get());
		
		return musicInfo;
	}
	
}
