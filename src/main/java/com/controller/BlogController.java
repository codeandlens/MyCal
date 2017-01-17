package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Blogs;
import com.entities.Users;
import com.services.BlogsServices;


@Controller
public class BlogController {
	
	@Autowired
	BlogsServices blogsServices;
	
	@RequestMapping("/blog")
    public ModelAndView getBlog() {
        ModelAndView view = new ModelAndView("page-blog/blog");
        return view;
    }
	
	@RequestMapping("/get-blog-list") @ResponseBody
	public List blogslist() {
		List list = blogsServices.list();
	   return list;
	}
	
	@RequestMapping("/blog-add") 
	public ModelAndView blogAdd() {
		 ModelAndView view = new ModelAndView("page-blog/blog-add");
	   return view;
	}
	
	@RequestMapping(value = "/perform-blog-add", method = RequestMethod.POST)
    public ModelAndView getBlogSaved(Blogs blog) {
		ModelAndView view = new ModelAndView("redirect:/blog");
        	blogsServices.saveOrUpdate(blog);
        return view;
    }
	
	@RequestMapping(value = "/blog-read/{blog_id}" , method = RequestMethod.GET)
    public ModelAndView userSetting(@PathVariable Integer blog_id) {
		ModelAndView view = new ModelAndView("page-blog/blog-read");
		List<Blogs> blogList = blogsServices.list();
		//Blogs blog = blogsServices.getBlogs(blog_id);
		
		Blogs blog = null;
		
		System.out.println("xxxxx");
		for(Blogs b : blogList){
			if(blog_id == b.getBlog_id()){
				blog = b;
			}
		}
		
		view.addObject("blog", blog);
		
       return view;
    }
	
}
