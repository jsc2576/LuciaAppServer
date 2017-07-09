package com.hiruashi.simgyuseon.video;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7176167241653390196L;

	private Integer video_idx; // 유튜브 인덱스
	private String video_nm;
	private String video_url; // 유튜브 url
	private String lcs; // 저작권
	private String date;
	private String con_ym;
	
	
	public Integer getVideo_idx() {
		return video_idx;
	}
	public void setVideo_idx(Integer video_idx) {
		this.video_idx = video_idx;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	public String getLcs() {
		return lcs;
	}
	public void setLcs(String lcs) {
		this.lcs = lcs;
	}
	public String getVideo_nm() {
		return video_nm;
	}
	public void setVideo_nm(String video_nm) {
		this.video_nm = video_nm;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCon_ym() {
		return con_ym;
	}
	public void setCon_ym(String con_ym) {
		this.con_ym = con_ym;
	}
}
