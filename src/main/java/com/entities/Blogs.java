package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="blogs")
public class Blogs {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="blog_id")
	private Integer blog_id;
	
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="blog_name")
	private String blog_name;
	
	@Column(name="blog_detail")
	private String blog_detail;
	
	
	
	public Integer getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(Integer blog_id) {
		this.blog_id = blog_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getBlog_name() {
		return blog_name;
	}
	public void setBlog_name(String blog_name) {
		this.blog_name = blog_name;
	}
	public String getBlog_detail() {
		return blog_detail;
	}
	public void setBlog_detail(String blog_detail) {
		this.blog_detail = blog_detail;
	}
	
	
	
	

}
