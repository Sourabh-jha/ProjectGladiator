package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bank.services.LoginService;

@Controller
@SessionAttributes("loggedInUser")
public class LoginController {

	@Autowired
	private LoginService loginservice;

	@RequestMapping(path = "/login.lti", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			ModelMap model) {

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
