package com.hiruashi.simgyuseon.video;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VideoController {

	@Autowired
	VideoService videoService;
	
	
	/**
	 * video upload main page
	 * @param video
	 * @return
	 */
	@RequestMapping("/video")
	public String VideoMain(@ModelAttribute Video video){
		return "video";
	}
	
	/**
	 * 유튜브 링크 추가
	 * @param video
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/video/upload", method=RequestMethod.POST)
	@ResponseBody
	public Integer InsertVideo(@ModelAttribute Video video) throws IOException{
		return videoService.InsertVideo(video);
	}
	
	
	/**
	 * 유튜브 링크 리스트 가져오기
	 * @param video
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/video/download/url", method=RequestMethod.POST)
	@ResponseBody
	public List<Video> getVideoInfo(@RequestBody Video video) throws IOException{
		return videoService.getVideoInfo(video); 
	}
	
	
	/**
	 * 콘서트 년월 리스트 가져오기
	 * @param video
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/video/ym/list", method=RequestMethod.POST)
	@ResponseBody
	public List<Video> getYMList(@ModelAttribute Video video) throws IOException{
		return videoService.getYMList(video);
	}
}
