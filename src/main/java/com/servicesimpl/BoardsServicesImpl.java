package com.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BoardsDao;
import com.entities.Boards;
import com.services.BoardsServices;

@Service
public class BoardsServicesImpl implements BoardsServices{
	
	@Autowired
	BoardsDao boardsDao;
	
	public boolean saveOrUpdate(Boards boards) {
		return boardsDao.saveOrUpdate(boards);
	}

	public List<Boards> list() {
		return boardsDao.list();
	}

	public boolean delete(Boards boards) {
		return boardsDao.delete(boards);
	}


}
