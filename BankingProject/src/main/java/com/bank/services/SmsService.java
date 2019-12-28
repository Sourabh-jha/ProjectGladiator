package com.bank.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService {
	
	@Autowired
	private SendMailService sendmailservice;
	
	public int sendMail(String email, String name) {
	Random rand = new Random();
	int OTP = rand.nextInt(999999);
	try {
		sendmailservice.send(email, "OTP for Verification",name+" One Time Password is: "+OTP);
		return OTP;
		}catch(Exception e) {
			e.printStackTrace();
			return OTP;
		}
	}
}
