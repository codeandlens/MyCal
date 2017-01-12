package com.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BlogsDao;
import com.entities.Blogs;

@Repository
@Transactional
public class BlogsDaoImpl implements BlogsDao {
	
	@Autowired
	SessionFactory session1;
	
	
	public List<Blogs> list() {
		return session1.getCurrentSession().createQuery("from Blogs").list();
	}

	public boolean saveOrUpdate(Blogs blogs) {
		session1.getCurrentSession().saveOrUpdate(blogs);
		return true;
	}

	public boolean dalete(Blogs blogs) {
		try {
			session1.getCurrentSession().delete(blogs);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	
	
}
