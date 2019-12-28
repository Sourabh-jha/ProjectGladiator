package com.bank.controller;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bank.dto.AddressDto;
import com.bank.dto.UserDetailsDto;
import com.bank.entity.Address;
import com.bank.entity.Login;
import com.bank.entity.UserDetails;
import com.bank.services.LoginService;
import com.bank.services.UserDetailService;

@Controller
@SessionAttributes("loggedInUser")
public class UserDetailController {
	
	@Autowired
	private UserDetailService userDetailsService;
	
	@RequestMapping(path = "/openAccount.lti",method = RequestMethod.POST)
	public String addANewUser(UserDetailsDto userDetails,AddressDto address, ModelMap model) {
		String username = (String) model.get("loggedInUser");
		System.out.println(model.get("loggedInUser"));
		userDetails.setUsername(username);
		address.setUsername(username);
		boolean bool = userDetailsService.addANewUser(userDetails, address);
		if(bool) {
			return "dashboard.jsp";
		}
		else{
			return null;
		}
		
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	  binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
	    @Override
	    public void setAsText(String text) throws IllegalArgumentException{
	      setValue(LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	    }
	  });
	}
	
		
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

	
	
	
}