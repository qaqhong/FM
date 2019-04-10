package com.mh.fm.po;
/** 
* @author BieHongLi 
* @version 创建时间：2017年3月19日 上午11:20:43 
* 菜单的实体类
*/
public class Menu {

	private Integer mid;//菜单的编号
	private String mname;//菜单的名称
	private String murl;//菜单的url
	private Integer pid;//菜单的父id
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMurl() {
		return murl;
	}
	public void setMurl(String murl) {
		this.murl = murl;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Menu(Integer mid, String mname, String murl, Integer pid) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.murl = murl;
		this.pid = pid;
	}
	public Menu() {
		super();
	}
	
	
	
}
