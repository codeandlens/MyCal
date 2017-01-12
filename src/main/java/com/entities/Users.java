package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="detail")
	private String detail;
	
	@Column(name="level_id")
	private Integer level_id;
	
	
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Integer getLevel_id() {
		return level_id;
	}
	public void setLevel_id(Integer level_id) {
		this.level_id = level_id;
	}
	

}
