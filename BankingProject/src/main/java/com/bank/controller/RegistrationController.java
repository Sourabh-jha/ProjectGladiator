package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.entity.Login;
import com.bank.services.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(path="/registration.lti",method=RequestMethod.POST)
	public String userRegistration(Login login, @RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword ) {
		try {
			if(password.equals(confirmPassword)) {
				boolean bool = registrationService.addUser(login);
				if(bool) {
				return "login.jsp";
				}else {
					System.out.println("Wrong Username!!");
					return "registrationUser.jsp";
				}
			}
				
		}
		catch (Exception e) {
			System.out.println("error aa gya");
			return "registrationUser.jsp";
		}
		return null;
	}
}
