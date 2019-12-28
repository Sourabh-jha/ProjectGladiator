package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.services.ApproveAccountService;

@Controller
public class AdminController {

	@Autowired
	private ApproveAccountService approveAccountService;
	
	@RequestMapping(path = "/approve.lti",method = RequestMethod.POST)
	public String approveAccount(@RequestParam("accountNo") int accountNo, ModelMap model) {
		
		boolean bool = approveAccountService.approveAccount(accountNo);
		if(bool) {
			model.put("approved", accountNo+" is approved.");
			return "admin.jsp";
		}else {
			model.put("approved", accountNo+" is not approved.");
			return "admin.jsp";
		}
	}
}
