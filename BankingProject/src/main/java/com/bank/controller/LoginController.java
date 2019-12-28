package com.bank.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bank.entity.Login;
import com.bank.entity.UserDetails;
import com.bank.services.LoginService;
import com.bank.services.UserDetailService;

@Controller
@SessionAttributes("loggedInUser")
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	@Autowired
	private UserDetailService userDetailService;

	@RequestMapping(path = "/login.lti", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap model,HttpServletRequest request) {
		if(username.equals("admin") && password.equals("admin")) {
			String projPath = request.getServletContext().getRealPath("/");
			System.out.println(projPath);
			File documentFolder = new File(projPath + "document");
			if(!documentFolder.exists())
				documentFolder.mkdir();
			
			List<UserDetails> list = userDetailService.getUserDetails();
			for(UserDetails user: list) {
				if(user.getDocumentname() != null) {
				File documentUploadedLocation = new File("D:/document/" + user.getDocumentname());
				File documentProjLocation = new File(documentFolder, user.getDocumentname());
				try {
					FileUtils.copyFile(documentUploadedLocation, documentProjLocation);
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
			}
			model.put("NotApproved", list);
			return "admin.jsp";
		}else {

		boolean i = loginservice.Checklogin(username, password);
		System.out.println(i);
		if (i) {
			model.put("loggedInUser", username);
			return "dashboard.jsp";
		} else {

			return null;
		}
		}

	}
	
	@RequestMapping(path = "/checkLogin.lti", method = RequestMethod.POST)
	public String login(ModelMap model) {
		System.out.println(model.get("loggedInUser"));
		if(model.get("loggedInUser")!=null) {
			return "openAccount.jsp";
		}
		else {
			return "login.jsp";
		}
	}
	
	@RequestMapping(path = "/forgotloginPassword.lti", method = RequestMethod.POST)
	public String forgotPassword(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("repassword") String repassword, ModelMap model) {
		if(password.equals(repassword)) {
			Login details = new Login();
			details.setUsername(username);
			details.setPassword(password);
			boolean bool = userDetailService.changePassword(details);
			if(bool) {
				model.put("changes", "Password Successfully Changed!!");
				return "login.jsp";
			}else {
				model.put("changes", "Password Couldn't Changed!!");
				return "forgot-password.jsp";
			}
		}
		return null;
	}
}
