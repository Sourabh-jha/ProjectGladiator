package com.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.UserDetails;
import com.bank.repository.UserDetailRepository;

@Service
public class ApproveAccountService {
	
	@Autowired
	private UserDetailRepository userDetailRepository;

	public boolean approveAccount(int accountNo) {
		UserDetails user = userDetailRepository.fetchAccount(accountNo);
		System.out.println(user.getApproved());
		user.setApproved("YES");
		return userDetailRepository.updateUser(user);
	}
	
}
