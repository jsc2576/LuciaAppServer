package com.hiruashi.simgyuseon.gallery;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class GalleryController {

	@Autowired
	private GalleryService galleryService;
	
	
	/**
	 * 데이터 입력하는 웹 페이지 반환
	 * @param entity
	 * @return
	 */
	@RequestMapping("/")
	public String GalleryMain(@ModelAttribute Gallery entity){
		return "image";
	}
	
	
	/**
	 * s3에 이미지 업로드
	 * @param uploadfile
	 * @param lcs
	 * @param path
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/gallery/upload/img", method=RequestMethod.POST)
	@ResponseBody
	public Integer UploadData(@RequestParam("img_file") MultipartFile uploadfile, @RequestParam(value="lcs", required=false) String lcs, @RequestParam("file_nm") String file_nm) throws IOException{
		/* 이미지 삽입 */
		Gallery gallery = new Gallery();
		gallery.setLcs(lcs);
		gallery.setImg_nm(file_nm);
		gallery.setImg_path("sim-app-img/sim_img/");
        return galleryService.ImgUpload(uploadfile, gallery);
	}
	
	
	/**
	 * 이미지 가져오기
	 * @param entity
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/gallery/download", method=RequestMethod.POST)
	@ResponseBody
	public List<Gallery> GetImg(@RequestBody Gallery entity) throws IOException{
		return galleryService.getImage(entity);
	}
}
