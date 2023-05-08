package com.music.restful.musicList.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import com.music.restful.user.entity.UserInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;


@Entity
@Table(name = "music_info")
@Getter
public class MusicInfo {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "uid", columnDefinition = "uuid", updatable = false, nullable = false)
	private UUID uid;
	
	private String name;
	private String title;
	private String info;
	private Double recommended;
	private String writer;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="r_userInfo_uid")
	private UserInfo userInfo;

	public UUID getId() {
		return uid;
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

	public UserInfo getUserInfo() {
		return userInfo;
	}
	
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	
	
}
