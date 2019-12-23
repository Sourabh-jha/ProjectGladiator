package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.entity.Transactions;
import com.bank.services.TransactionsService;

@Controller
public class TransactionsController {
	
	@Autowired
	private TransactionsService transactionService;

	@RequestMapping(path = "/neft.lti", method = RequestMethod.POST)
	public String neftTransfer(Transactions transaction, @RequestParam("toAccount") int toAccount ,ModelMap model) {
		transaction.setTransMode("NEFT");
		transaction.setApproved("NO");
		
		boolean check = transactionService.checkBene(toAccount);
		if(check) {
			boolean msg = transactionService.neftTransfer(transaction);
			
			if (msg) {
				model.put("NEFT", "Success!!");
				return "neft.jsp";
			} else {
				model.put("NEFT", "Failed!!");
				return "neft.jsp";
			}
		}
		return "Beneficiary Not Added";
		
	}
	
}
