package com.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
 






import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 






import com.entities.Users;
import com.services.UsersServices;
 
@Controller
//@RequestMapping("users")
public class UsersController {
 
    @Autowired
    UsersServices userServices;
    
    @Autowired
    private HttpServletRequest request;
    
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("page-user/users");
        return view;
    }
    
    
    @RequestMapping(value = "/user-setting", method = RequestMethod.GET)
    public ModelAndView userSetting() {
       ModelAndView view = new ModelAndView("page-user/user-setting");
       
        return view;
    }
 
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getSaved(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (userServices.saveOrUpdate(users)) {
            map.put("status", "200");
            map.put("message", "Your record have been saved successfully");
        }
 
        return map;
    }
 
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getAll(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        List<Users> list = userServices.list();
 
        if (list != null) {
            map.put("status", "200");
            map.put("message", "Data found");
            map.put("data", list);
        } else {
            map.put("status", "404");
            map.put("message", "Data not found");
 
        }
 
        return map;
    }
 
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> delete(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (userServices.delete(users)) {
            map.put("status", "200");
            map.put("message", "Your record have been deleted successfully");
        }
 
        return map;
    }
    
    
    @RequestMapping(value = "/register-users", method = RequestMethod.POST)
    public ModelAndView preformRegister(Users users) {
    	ModelAndView view = new ModelAndView("redirect:/login");
        Map<String, Object> map = new HashMap<String, Object>();
        
        String passwordEncode = users.getPassword();
        users.setPassword(encode(passwordEncode));
        
        System.out.println("sssss");
        if (userServices.saveOrUpdate(users)) {
            map.put("status", "200");
            map.put("message", "Your record have been saved successfully");
        }
 
        return view;
    }
    
    
    
    
   public String encode(String s) {
		String result = "";
		try {
			java.security.MessageDigest digest = java.security.MessageDigest.
				getInstance("SHA-256");
			byte[] hash = digest.digest(s.getBytes("UTF-8"));
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					result += '0';
				result += hex;
			}
		} catch (Exception e) {}
		return result;
    }
    
}