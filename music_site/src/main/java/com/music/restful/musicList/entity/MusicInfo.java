package com.music.restful.musicList.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "music_info")
@Getter
public class MusicInfo {
	
	@Id
	private UUID id;
	private String name;
	
	public MusicInfo(UUID id, String name) {
		this.id = id;
		this.name = name;
	}
}
