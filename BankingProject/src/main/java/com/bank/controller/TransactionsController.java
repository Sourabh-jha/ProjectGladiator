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

import com.bank.dto.FundTransferDto;
import com.bank.entity.Transactions;
import com.bank.services.TransactionsService;

@Controller
public class TransactionsController {
	
	@Autowired
	private TransactionsService transactionService;	
	
	@RequestMapping(path = "/fundTransfer.lti", method = RequestMethod.POST)
	public String fundTransfer(FundTransferDto fundTransferDto, ModelMap model) {
		Transactions trans = transactionService.initiateTransfer(fundTransferDto);
			if(trans != null) {
				model.put("transaction", trans);
				return "successfulTransfer.jsp";
			}
			else {
				model.put("TransferMessage", "Failed!!");
				return "fundTransfer.jsp";
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
	
}
