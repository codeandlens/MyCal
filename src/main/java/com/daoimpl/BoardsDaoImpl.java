package com.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BoardsDao;
import com.entities.Boards;

@Repository
@Transactional
public class BoardsDaoImpl implements BoardsDao{
	
	@Autowired
	SessionFactory session2;
	
	public List<Boards> list() {
		return session2.getCurrentSession().createQuery("from Boards").list();
	}
	
	public boolean delete(Boards boards) {
		try {
			session2.getCurrentSession().delete(boards);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public boolean saveOrUpdate(Boards boards) {
		session2.getCurrentSession().saveOrUpdate(boards);
		return true;
	}

	

}
