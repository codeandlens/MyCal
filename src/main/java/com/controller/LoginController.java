package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;









import com.entities.Users;
import com.services.UsersServices;
import com.sun.xml.internal.bind.v2.runtime.output.Encoded;


@Controller
public class LoginController {
	
	@Autowired
    UsersServices userServices;
	
	@RequestMapping("/login")
    public ModelAndView getLogin() {
        ModelAndView view = new ModelAndView("page-user/login");
        return view;
    }
	
	@RequestMapping("/register")
    public ModelAndView getRegister() {
        ModelAndView view = new ModelAndView("page-user/register");
       
        return view;
    }
	
	@RequestMapping(value="/login-user", method=RequestMethod.POST)
	String login(HttpSession session, String email, String password) {
		String userName = "";
		Users sessionUser = null;
		password = new UsersController().encode(password);
		
		List<Users> userList = null;
		userList =  userServices.list();
			for(Users u : userList){
				if(u.getEmail().equals(email)){
					if(u.getPassword().equals(password)){
						userName = u.getUser_name();
						sessionUser = u;
					}else{
						return "login";
					}
				}
			}
		session.setAttribute("user", userName);
		session.setAttribute("sUser", sessionUser);
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	String logout(HttpSession session) {
		session.removeAttribute("user");
		session.invalidate();
		return "redirect:/";
	}
	
	
	
	
	
}
