package com.music.restful.musicList.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.music.restful.musicList.dto.MusicRecommendRequestDto;
import com.music.restful.musicList.entity.MusicInfo;
import com.music.restful.musicList.repository.MusicInfoRepository;
import com.music.restful.musicList.service.MusicInfoService;

public class MusicInfoServiceImpl implements MusicInfoService {
	
	@Autowired
	private MusicInfoRepository musicInfoRepository;
	

	@Override
	public MusicInfo createMusicInfo(MusicRecommendRequestDto musicRecommendRequestDto) {
		
		MusicInfo musicInfo = musicRecommendRequestDto.toEntity();
		
		musicInfo = musicInfoRepository.save(musicInfo);
		
		return musicInfo;
	}

}
