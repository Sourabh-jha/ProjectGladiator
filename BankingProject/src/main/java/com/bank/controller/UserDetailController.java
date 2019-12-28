package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.dto.AddressDto;
import com.bank.dto.UserDetailsDto;
import com.bank.entity.Address;
import com.bank.entity.Login;
import com.bank.entity.UserDetails;
import com.bank.services.UserDetailService;

@Controller
public class UserDetailController {
	
	@Autowired
	private UserDetailService userDetailsService;
	
	@RequestMapping(path = "/openAccount.lti",method = RequestMethod.POST)
	public String addANewUser(UserDetailsDto userDetails,AddressDto address, ModelMap model) {
		String username = (String) model.get("loggedInUser");
		System.out.println(username);
		userDetails.setUsername(username);
		address.setUsername(username);
		boolean bool = userDetailsService.addANewUser(userDetails, address);
		if(bool) {
			return "home.jsp";
		}
		else{
			return null;
		}
		
	}
	
		
	

	
	
	
}