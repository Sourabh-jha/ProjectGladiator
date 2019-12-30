package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.entity.UserDetails;
import com.bank.services.UserDetailService;

@Controller
public class DashboardController {
	
	@Autowired
	private UserDetailService userDetailService;

	@RequestMapping(path="/dashboardaccDetail.lti", method = RequestMethod.POST)
	public String accDetail(ModelMap model) {
		List<UserDetails> users = userDetailService.getUserDetails();
		model.put("userdetails", users);
		return "accountDetail.jsp";
	}
	
	@RequestMapping(path="/dashboardaccSummary.lti", method = RequestMethod.POST)
	public String accSummary(ModelMap model) {
		List<UserDetails> users = userDetailService.getUserDetails();
		model.put("userdetails", users);
		return "accountSummary.jsp";
	}
	
	@RequestMapping(path="/dashboardfundTransfer.lti", method = RequestMethod.POST)
	public String fundTransafer(ModelMap model) {
		List<UserDetails> users = userDetailService.getUserDetails();
		model.put("userdetails", users);
		return "fundTransfer.jsp";
	}
	
	@RequestMapping(path="/dashboardaccStatement.lti", method = RequestMethod.POST)
	public String accStatement(ModelMap model) {
		List<UserDetails> users = userDetailService.getUserDetails();
		model.put("userdetails", users);
		return "accountStatement.jsp";
	}
	
}
