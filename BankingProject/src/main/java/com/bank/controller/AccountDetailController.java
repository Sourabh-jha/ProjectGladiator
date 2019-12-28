package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.entity.UserDetails;
import com.bank.services.UserDetailService;

@Controller
public class AccountDetailController {
	
	@Autowired
	private UserDetailService userDetailService;

	@RequestMapping(path="/accountDetail.lti", method = RequestMethod.POST)
	public String accountStatement(@RequestParam("accountNo") int accountNo, ModelMap model) {
		UserDetails user = userDetailService.getUserDetailsByaccNo(accountNo);
		model.put("accountDetail", user);
		return "getAccountDetail.jsp";
	}
	
}
