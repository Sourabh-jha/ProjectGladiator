package com.bank.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.entity.UserDetails;


@Repository
public class UserDetailsRepository  {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addNewUser(UserDetails userDetails) {
		entityManager.persist(userDetails);
		
	}

	public void updateNewUser(UserDetails userDetails) {
		entityManager.merge(userDetails);
		
	}

	public void deleteNewUser(UserDetails userDetails) {
		entityManager.remove(userDetails);
		
	}
	public UserDetails fetchAccount(int accountNo) {
		UserDetails acc = entityManager.find(UserDetails.class, accountNo);
		return acc;
	}

	public List<UserDetails> getUserDetailsList() {
		return null;
	}
	
	
	

}
