package com.hiruashi.simgyuseon.video;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VideoRepository {

	@Autowired
	SqlSession sqlSession;
	
	/**
	 * 유튜브 링크 추가
	 * @param video
	 * @return
	 */
	public Integer InsertVideo(Video video){
		return sqlSession.insert("com.hiruashi.simgyuseon.video.create", video);
	}

	
	/**
	 * 유튜브 링크 리스트 가져오기
	 * @param video
	 * @return
	 */
	public List<Video> getVideoInfo(Video video){
		return sqlSession.selectList("com.hiruashi.simgyuseon.video.getvideourl", video);
	}
	
	
	/**
	 * 콘서트 년월 리스트 가져오기
	 * @param video
	 * @return
	 */
	public List<Video> getYMList(Video video){
		return sqlSession.selectList("com.hiruashi.simgyuseon.video.getcondate", video);
	}
}
