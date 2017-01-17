package com.dao;

import java.util.List;

import com.entities.Boards;

public interface BoardsDao {
	
	public List<Boards> list();
	
	public boolean saveOrUpdate(Boards boards);
	
	public boolean delete(Boards boards);

}
