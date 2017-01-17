package com.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BoardsTypeDao;
import com.entities.BoardsType;
import com.services.BoardsTypeServices;

@Service
public class BoardsTypeServicesImpl implements BoardsTypeServices{
	
	@Autowired
	BoardsTypeDao boardsTypeDao;
	
	public List<BoardsType> list() {
		return boardsTypeDao.list();
	}

}
