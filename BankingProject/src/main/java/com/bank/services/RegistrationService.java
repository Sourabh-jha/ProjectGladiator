package com.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Login;
import com.bank.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	public boolean existByUsername(String username) {
		if(registrationRepository.existByUsername(username)>0)
			return true;
		else
			return false;
	}
	
	public boolean addUser(Login login) {
		if(!existByUsername(login.getUsername())) {
				registrationRepository.addUserDetails(login);
				return true;
		}
		else
			return false;
	}
}