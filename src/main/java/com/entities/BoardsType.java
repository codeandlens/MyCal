package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boards_type")
public class BoardsType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="board_type_id")
	private Integer board_type_id;
	
	@Column(name="board_type_name")
	private String board_type_name;

	public Integer getBoard_type_id() {
		return board_type_id;
	}

	public void setBoard_type_id(Integer board_type_id) {
		this.board_type_id = board_type_id;
	}

	public String getBoard_type_name() {
		return board_type_name;
	}

	public void setBoard_type_name(String board_type_name) {
		this.board_type_name = board_type_name;
	}
	
	

}
