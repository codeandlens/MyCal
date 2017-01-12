package com.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BlogsDao;
import com.entities.Blogs;
import com.services.BlogsServices;

@Service
public class BlogsServicesImpl implements BlogsServices{
	
	@Autowired
	BlogsDao blogsDao;
	
	public boolean saveOrUpdate(Blogs blogs) {
		return blogsDao.saveOrUpdate(blogs);
	}

	public List<Blogs> list() {
		return blogsDao.list();
	}

	public boolean delete(Blogs blogs) {
		return blogsDao.dalete(blogs);
	}

}
