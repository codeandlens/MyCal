package com.dao;

import java.util.List;

import com.entities.Blogs;

public interface BlogsDao {
	
	public List<Blogs> list();
	
	public boolean saveOrUpdate(Blogs blogs);
	
	public boolean dalete(Blogs blogs);
	
	

}
