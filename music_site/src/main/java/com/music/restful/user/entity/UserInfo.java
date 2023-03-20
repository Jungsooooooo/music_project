package com.music.restful.user.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class UserInfo {

	@Id
	private String id;
	
	private String password;
	
	private String address;
	
	private String phone;
	
	private UUID uid;
	
}
