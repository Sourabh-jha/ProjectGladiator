package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.entity.Beneficiary;
import com.bank.entity.Login;
import com.bank.entity.UserDetails;

@Repository
public class BeneficiaryRepository {

	@PersistenceContext
	private EntityManager entityManager;

@Transactional
public boolean addNewBeneficiary(Beneficiary beneficiary) 
{
	try {
		entityManager.merge(beneficiary);
		return true;
	}catch(Exception e) {
		e.printStackTrace();
		return false;
	}
	
}
public Login fetchUsername(String username) {
	Login user = entityManager.find(Login.class, username);
	return user;
}
public UserDetails fetchAccount(int accountNo) {
	UserDetails acc = entityManager.find(UserDetails.class, accountNo);
	return acc;
}
	
}
