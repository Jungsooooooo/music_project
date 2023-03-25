package com.music.restful.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.restful.user.entity.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, UUID> {

}
