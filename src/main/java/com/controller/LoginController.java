package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
	@RequestMapping("/login")
    public ModelAndView getLogin() {
        ModelAndView view = new ModelAndView("login");
        return view;
    }
	
	@RequestMapping("/register")
    public ModelAndView getRegister() {
        ModelAndView view = new ModelAndView("register");
        return view;
    }
	
}
