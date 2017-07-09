package com.hiruashi.simgyuseon.schedule;

import java.io.Serializable;

public class Schedule implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3662926694112511937L;

	private Integer sch_idx;
	private String sch_nm;
	private Integer sch_sta_year;
	private Integer sch_sta_month;
	private Integer sch_sta_date;
	private Integer sch_end_year;
	private Integer sch_end_month;
	private Integer sch_end_date;
	public Integer getSch_idx() {
		return sch_idx;
	}
	public void setSch_idx(Integer sch_idx) {
		this.sch_idx = sch_idx;
	}
	public String getSch_nm() {
		return sch_nm;
	}
	public void setSch_nm(String sch_nm) {
		this.sch_nm = sch_nm;
	}
	public Integer getSch_sta_year() {
		return sch_sta_year;
	}
	public void setSch_sta_year(Integer sch_sta_year) {
		this.sch_sta_year = sch_sta_year;
	}
	public Integer getSch_sta_month() {
		return sch_sta_month;
	}
	public void setSch_sta_month(Integer sch_sta_month) {
		this.sch_sta_month = sch_sta_month;
	}
	public Integer getSch_sta_date() {
		return sch_sta_date;
	}
	public void setSch_sta_date(Integer sch_sta_date) {
		this.sch_sta_date = sch_sta_date;
	}
	public Integer getSch_end_year() {
		return sch_end_year;
	}
	public void setSch_end_year(Integer sch_end_year) {
		this.sch_end_year = sch_end_year;
	}
	public Integer getSch_end_month() {
		return sch_end_month;
	}
	public void setSch_end_month(Integer sch_end_month) {
		this.sch_end_month = sch_end_month;
	}
	public Integer getSch_end_date() {
		return sch_end_date;
	}
	public void setSch_end_date(Integer sch_end_date) {
		this.sch_end_date = sch_end_date;
	}
}
