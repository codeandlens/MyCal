package com.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BoardsTypeDao;
import com.entities.BoardsType;

@Repository
@Transactional
public class BoardsTypeDaoImpl implements BoardsTypeDao{
	
	@Autowired
	SessionFactory session4;
	
	public List<BoardsType> list() {
		return session4.getCurrentSession().createQuery("from BoardsType").list();
	}

}
