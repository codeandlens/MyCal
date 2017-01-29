package com.controller;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;




import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.entities.Users;
import com.services.UsersServices;


@Controller
public class UploadController {
	
	@Autowired
    private HttpServletRequest request;
	
	@Autowired
    UsersServices userServices;
	
	@RequestMapping(value = "/upload-single/{frompage}", method = RequestMethod.GET)
    public ModelAndView getPageUpload(@PathVariable String frompage) {
        ModelAndView view = new ModelAndView("page-upload/upload-single");
        view.addObject("frompage", frompage);
        
        
        return view;
    }
	
	
	@RequestMapping(value = "/upload-user", method = RequestMethod.POST)
    public String singleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:/user-setting";
        }

        try {
//			String realPathtoUploads =  request.getServletContext().getRealPath("/uploads/");
//        	URL location = UploadController.class.getProtectionDomain().getCodeSource().getLocation();
//          System.out.println(location.getFile());
//        	String rootPath = System.getProperty("catalina.home");
//        	String filePath = System.getProperty("java.io.tmpdir");
        	String path = new File(".").getCanonicalPath();
        	String pathImages = "C:/Users/chivas/myjobworkspace/Mycal/src/main/webapp/images/";
        	
        	File dir = new File(pathImages + File.separator + "users");
        	String name = file.getOriginalFilename();
        	
        	if (!dir.exists())
				dir.mkdirs();

			File serverFile = new File(dir.getAbsolutePath()+ File.separator + name);
            byte[] bytes = file.getBytes();
            
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
            stream.write(bytes);
			stream.close();
			
			redirectAttributes.addFlashAttribute("message", "OK.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/user-setting";
    }
	
	
	@RequestMapping(value = "/preform-upload-single", method = RequestMethod.POST)
    public String preformSingleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes,@RequestParam("frompage") String frompage) {
		
		Users users = (Users) request.getSession().getAttribute("sUser");
		
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:/user-setting";
        }

        try {
//			String realPathtoUploads =  request.getServletContext().getRealPath("/uploads/");
//        	URL location = UploadController.class.getProtectionDomain().getCodeSource().getLocation();
//          System.out.println(location.getFile());
//        	String rootPath = System.getProperty("catalina.home");
//        	String filePath = System.getProperty("java.io.tmpdir");
        	String path = new File(".").getCanonicalPath();
        	String pathImages = "C:/Users/chivas/myjobworkspace/Mycal/src/main/webapp/images/";
        	String name = file.getOriginalFilename();
        	
        	String insertPath = setPathToDb(users,frompage,name);
        	
        	
        	File dir = new File(pathImages + File.separator + "users");
        	
        	
        	if (!dir.exists())
				dir.mkdirs();

			File serverFile = new File(dir.getAbsolutePath()+ File.separator + name);
            byte[] bytes = file.getBytes();
            
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
            stream.write(bytes);
			stream.close();
			
			redirectAttributes.addFlashAttribute("message", "OK.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/user-setting";
    }


	private String setPathToDb(Object obj, String frompage, String name) {
		String result = "";
			if(frompage.equals("users")){
				Users u = (Users) obj;
				u.setPath_image(frompage+"/"+name);
				userServices.saveOrUpdate(u);
				result = frompage;
			}
		
		return result;
	}
	
	
	
	
	

}
