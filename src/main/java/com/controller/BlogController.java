package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.services.BlogsServices;


@Controller
public class BlogController {
	
	@Autowired
	BlogsServices blogsServices;
	
	@RequestMapping("/blog")
    public ModelAndView getBlog() {
        ModelAndView view = new ModelAndView("blog");
        return view;
    }
	
	@RequestMapping("/get-blog-list") @ResponseBody
	public List blogslist() {
		List list = blogsServices.list();
	   return list;
	}
	

}
