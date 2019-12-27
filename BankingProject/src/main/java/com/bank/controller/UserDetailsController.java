package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.dto.FundTransferDto;
import com.bank.dto.UserDetailsDto;
import com.bank.entity.UserDetails;
import com.bank.repository.UserDetailsRepository;
import com.bank.services.UserDetailsService;



@Controller
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@RequestMapping(path = "/openAccount.lti", method = RequestMethod.POST)
	public String openAccount(UserDetailsDto userDetailsDto, ModelMap model) {
		boolean check = userDetailsService.openAccount(userDetailsDto);
			if(check) {
				model.put("UserDetailsMessage", "Successfull!!");
				return "dashboard.jsp";  //
			}
			else {
				model.put("UserDetailsMessage", "UnSuccessfull!!");
				return "dashboard.jsp";//
			}
	}
	
	@RequestMapping(path = "/openAccount.lti", method = RequestMethod.POST)
	public String addAddress(UserDetailsDto userDetailsDto, ModelMap model) {
		boolean check = userDetailsService.addAddress(userDetailsDto);
			if(check) {
				model.put("addAddressMessage", "Successfull!!");
				return "dashboard.jsp";//
			}
			else {
				model.put("addAddressMessage", "UnSuccessfull!!");
				return "dashboard.jsp";//
			}
	}
	
	
	
	
	
}
