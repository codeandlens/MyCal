package com.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="boards")
public class Boards {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="board_id")
	private Integer board_id;
	
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="board_name")
	private String board_name;
	
	@Column(name="board_sub_detail")
	private String board_sub_detail;
	
	@Column(name="board_detail")
	private String board_detail;
	
	@Column(name="board_type_id")
	private Integer board_type_id;
	
	@Column(name="count_view")
	private Integer count_view;
	
	
	public Integer getBoard_id() {
		return board_id;
	}
	public void setBoard_id(Integer board_id) {
		this.board_id = board_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_sub_detail() {
		return board_sub_detail;
	}
	public void setBoard_sub_detail(String board_sub_detail) {
		this.board_sub_detail = board_sub_detail;
	}
	public String getBoard_detail() {
		return board_detail;
	}
	public void setBoard_detail(String board_detail) {
		this.board_detail = board_detail;
	}
	public Integer getBoard_type_id() {
		return board_type_id;
	}
	public void setBoard_type_id(Integer board_type_id) {
		this.board_type_id = board_type_id;
	}
	public Integer getCount_view() {
		return count_view;
	}
	public void setCount_view(Integer count_view) {
		this.count_view = count_view;
	}
	
	

}
