package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.entity.Transactions;
import com.bank.services.AccountSummaryService;

@Controller
public class AccountSummary {
	
	@Autowired
	private AccountSummaryService accountSummaryService;

	@RequestMapping(path="/accountSummary.lti", method = RequestMethod.POST)
	public String accountSummary(@RequestParam("accountNo") int accountNo, ModelMap model) {
		System.out.println(accountNo);
		List<Transactions> previousTrans = accountSummaryService.fetchPreviousTransactions(accountNo);
		model.put("previousTransactions", previousTrans);
		return "previousTransactions.jsp";
	}
	
}
