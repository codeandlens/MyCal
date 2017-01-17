package com.services;

import java.util.List;

import com.entities.Blogs;

public interface BlogsServices {
	
	public boolean saveOrUpdate(Blogs blogs);
	
	public List<Blogs> list();
	
	public boolean delete(Blogs blogs);
	

}
