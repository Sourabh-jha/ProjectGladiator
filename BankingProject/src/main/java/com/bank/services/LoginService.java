package com.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginrepo;
	
public boolean Checklogin(String username,String password) {
	return loginrepo.check(username, password);
	
	
	
	
}
}
