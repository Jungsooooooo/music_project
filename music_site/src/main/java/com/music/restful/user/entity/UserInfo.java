package com.music.restful.user.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import com.music.restful.musicList.entity.MusicInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;


@Entity
@Table(name="user_info")
@Getter
public class UserInfo  {
	
	private String id;
	
	private String password;
	
	private String address;
	
	private String phone;
	
	private String email;
	
	private LocalDateTime birth;
	
	private String type;
	
	@OneToOne(mappedBy = "userInfo", fetch=FetchType.LAZY)
	private MusicInfo musicInfo;
	
	@Id 
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "uid", columnDefinition = "uuid", updatable = false, nullable = false)
	private UUID uid;

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getBirth() {
		return birth;
	}
	
	public void setBirth(LocalDateTime birth) {
		this.birth = birth;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type=type;
	}

	public UUID getUid() {
		return uid;
	}
	
	
	
}
