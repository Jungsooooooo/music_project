package com.music.restful.musicList.entity;

import java.util.UUID;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;


@Entity(name = "music_info")
@Getter
public class MusicInfo {
	
	@Id
	private UUID id;
	
	private String name;
	private String title;
	private String info;
	private Double recommended;
	private String writer;

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return info;
	}
	
	public void setInfo(String Info) {
		this.info = Info;
	}

	public Double getRecommended() {
		return recommended;
	}
	
	public void setRecommended(Double recommended) {
		this.recommended = recommended;
	}

	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
