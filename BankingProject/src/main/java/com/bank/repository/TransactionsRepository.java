package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bank.entity.Transactions;
import com.bank.entity.UserDetails;

@Repository
public class TransactionsRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public boolean fundTransfer(Transactions transaction) {
		try {
		entityManager.merge(transaction);
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
//	public boolean checkBene(int toAccount) {
//		System.out.println("Repo-> checkbean");
//		Query q = entityManager.createQuery("select u from UserDetails u where u.accountNo=:id");
//		q.setParameter("id", toAccount);
//		
//		if((UserDetails)q.getSingleResult() != null) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	public UserDetails fetchAccount(int accountNo) {
		UserDetails acc = entityManager.find(UserDetails.class, accountNo);
		return acc;
	}
	
}
