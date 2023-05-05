package com.music.restful.user.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;


@Entity
@Getter
public class UserInfo  {
	
	private String id;
	
	private String password;
	
	private String address;
	
	private String phone;
	
	private String email;
	
	private LocalDateTime birth;
	
	private String type;
	
	 @Id @GeneratedValue(generator = "uuid2")
	 @GenericGenerator(name="uuid2", strategy = "uuid2")
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
