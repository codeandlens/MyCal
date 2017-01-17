package com.services;

import java.util.List;

import com.entities.Boards;

public interface BoardsServices {
	
	public boolean saveOrUpdate(Boards boards);
	
	public List<Boards> list();
	
	public boolean delete(Boards boards);
	
	
}
