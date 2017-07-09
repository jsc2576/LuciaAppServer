package com.hiruashi.simgyuseon.gallery;

import java.io.Serializable;

public class Gallery implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7303438034650891282L;
	
	private Integer img_idx; // 인덱스
	private String date; // 날짜
	private String lcs; //저작권
	private String img_path; // 이미지가 저장되는 경로
	private String img_nm; // 이미지 본래 이름
	private String img_file_nm; // s3에 저장되는 파일 이름
	private String img_url; // 이미지 url
	private Integer offset;
	private Integer limit;
	
	public Integer getImg_idx() {
		return img_idx;
	}
	public void setImg_idx(Integer img_idx) {
		this.img_idx = img_idx;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLcs() {
		return lcs;
	}
	public void setLcs(String lcs) {
		this.lcs = lcs;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public String getImg_nm() {
		return img_nm;
	}
	public void setImg_nm(String img_nm) {
		this.img_nm = img_nm;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getImg_file_nm() {
		return img_file_nm;
	}
	public void setImg_file_nm(String img_file_nm) {
		this.img_file_nm = img_file_nm;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	
}
