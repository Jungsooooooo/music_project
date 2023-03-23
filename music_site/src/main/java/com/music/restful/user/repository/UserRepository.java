package com.music.restful.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.music.restful.user.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, UUID> {

}
