package com.hiruashi.simgyuseon.video;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

	@Autowired
	VideoRepository videoRepository;
	
	/**
	 * 콘서트 추가 함수
	 * @param video
	 * @return
	 * @throws IOException
	 */
	public Integer InsertVideo(Video video) throws IOException{
		
		//유튜브 키값 뽑아내기
		String ytb_url = video.getVideo_url().substring(17, 28);
		video.setVideo_url(ytb_url);
		
		//저장날짜 설정
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhddssSSS");
		String date_str = dateFormat.format(new Date());
		
		video.setDate(date_str);
		
		return videoRepository.InsertVideo(video);
	}
	
	
	/**
	 * 콘서트 유튜브 리스트 가져오기
	 * @param video
	 * @return
	 * @throws IOException
	 */
	public List<Video> getVideoInfo(Video video) throws IOException{
		List<Video> result = videoRepository.getVideoInfo(video);
		return result;
	}
	
	
	/**
	 * 콘서트 년월 리스트 가져오기
	 * @param video
	 * @return
	 * @throws IOException
	 */
	public List<Video> getYMList(Video video) throws IOException{
		return videoRepository.getYMList(video);
	}
}
