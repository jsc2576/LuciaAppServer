package com.hiruashi.simgyuseon.gallery;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hiruashi.simgyuseon.AwsS3Config;

@Service
public class GalleryService {

	@Autowired
	GalleryRepository galleryRepository;
	@Autowired
	AwsS3Config awsS3Config;
	
	private String s3_url = "https://s3.ap-northeast-2.amazonaws.com"; 
	
	
	/**
	 * 이미지 업로드
	 * @param multipartFile
	 * @param gallery
	 * @return
	 * @throws IOException
	 */
	public Integer ImgUpload(MultipartFile multipartFile, Gallery gallery) throws IOException{// s3에 업로드 메소드

		String file_name = multipartFile.getOriginalFilename();
		String directory = "";
		String filepath = Paths.get(directory, file_name).toString();
		File file = new File(filepath);
		
		//임시 폴더에 파일 저장
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		BufferedOutputStream stream = new BufferedOutputStream(fileOutputStream);
        stream.write(multipartFile.getBytes());
        stream.close();
		
        //저장되는 날짜 설정
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhddssSSS");
		String date_str = dateFormat.format(new Date());
		gallery.setDate(date_str);

		//s3 업로드 될 파일 이름 설정
		String file_nm_str = file_name.substring(0, file_name.lastIndexOf("."))+"_"+date_str+file_name.substring(file_name.lastIndexOf("."), file_name.length());
		gallery.setImg_file_nm(file_nm_str);
		
		//실제 저장되는 경로(버킷 경로 제외)
		String s3_path = gallery.getImg_path().substring(gallery.getImg_path().indexOf("/")+1, gallery.getImg_path().length());
		
		
		//aws s3 업로드
		awsS3Config.Upload(s3_path, gallery.getImg_file_nm(), file);
		
		return galleryRepository.ImgInsert(gallery);
	}
	
	
	/**
	 * 이미지 정보 가져오기
	 * @param entity
	 * @return
	 * @throws IOException
	 */
	public List<Gallery> getImage(Gallery entity) throws IOException{
		List<Gallery> img_info = galleryRepository.GetImgInfo(entity);
		
		//이미지 url로 만들기
		for(int i=0; i<img_info.size(); i++){
			img_info.get(i).setImg_url(s3_url+"/"+img_info.get(i).getImg_path()+img_info.get(i).getImg_file_nm());
		}
		return img_info;
	}
}
