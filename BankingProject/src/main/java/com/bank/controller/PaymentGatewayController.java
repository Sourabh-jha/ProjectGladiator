package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.entity.UserDetails;
import com.bank.repository.TransactionsRepository;
import com.bank.services.SmsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PaymentGatewayController {
	
	@Autowired
	private TransactionsRepository transactionsRepository; 
	
	@Autowired
	private SmsService smsService;
	
	@RequestMapping(path = "/paymentGateway.lti", method = RequestMethod.POST)
	public String goPayment(@RequestParam("fromAccount") int fromAccount, @RequestParam("toAccount") int toAccount, @RequestParam("amount") int amount, ModelMap model) {
	
		UserDetails userDetails = transactionsRepository.fetchAccount(fromAccount);
		if(userDetails!=null) {
			String email = userDetails.getEmailId();
			String name = userDetails.getFirstname();
			List<Integer> list = new ArrayList<Integer>();
			list.add(fromAccount);
			list.add(toAccount);
			list.add(amount);
			int otp = smsService.sendMail(email, name);
			if(otp != 0) {
				model.put("otpIs", otp);
				model.put("details", list);
				return "verifyOtp.jsp";
			}
			else {
				System.out.println("OTP not generated!!");
				return "paymentGateway.jsp";
			}
		}
		return null;
	}
	
	@RequestMapping(path = "/verifyOtp.lti", method = RequestMethod.POST)
	public String goVerifyMyOtp(@RequestParam("correctOtp") int correctOtp, @RequestParam("enteredOtp") int enteredOtp, @RequestParam("fromAccount") int fromAccount, @RequestParam("toAccount") int toAccount, @RequestParam("amount") int amount, ModelMap model) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(fromAccount);
		list.add(toAccount);
		list.add(amount);
		if(correctOtp == enteredOtp) {
			model.put("details", list);
			return "confirmPayment.jsp";
		}
		else {
			return "paymentGateway.jsp";
		}
	}
	
}
