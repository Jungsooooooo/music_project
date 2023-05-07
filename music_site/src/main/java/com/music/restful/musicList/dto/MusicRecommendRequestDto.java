package com.music.restful.musicList.dto;

import com.music.restful.musicList.entity.MusicInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class MusicRecommendRequestDto {
	
	private String title;
	private String info;
	private Double recommended;
	
	
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
	
	public MusicInfo toEntity() {
		MusicInfo musicInfo = new MusicInfo();
		
		musicInfo.setTitle(title);
		musicInfo.setInfo(info);
		musicInfo.setRecommended(recommended);
		
		return musicInfo;
	}
	
}
