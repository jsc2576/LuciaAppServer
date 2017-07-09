package com.hiruashi.simgyuseon.gallery;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GalleryRepository {

	@Autowired
	SqlSession sqlSession;
	
	public Integer ImgInsert(Gallery entity){
		sqlSession.insert("com.hiruashi.simgyuseon.gallery.create", entity);
		return 1;
	}
	
	public List<Gallery> GetImgInfo(Gallery entity){
		return sqlSession.selectList("com.hiruashi.simgyuseon.gallery.getimg", entity);
	}
}
