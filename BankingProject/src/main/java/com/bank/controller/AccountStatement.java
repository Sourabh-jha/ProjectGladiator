package com.bank.controller;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.entity.Transactions;
import com.bank.services.AccountStatementService;

@Controller
public class AccountStatement {

	@Autowired
	private AccountStatementService accountStatementService; 
	
	@RequestMapping(path="/accountStatement.lti", method = RequestMethod.POST)
	public String accountStatement(@RequestParam("fromDate") LocalDate fromDate, @RequestParam("toDate") LocalDate toDate, @RequestParam("accountNo") int accountNo, ModelMap model) {
		List<Transactions> statement = accountStatementService.fetchAccountStatement(fromDate, toDate, accountNo);
		model.put("previousTransactions", statement);
		return "statements.jsp";
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
