package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bank.entity.Transactions;

@Repository
public class TransactionsRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public boolean neftTransfer(Transactions transaction) {
		try {
		entityManager.persist(transaction);
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean checkBene(Transactions transaction) {
		int accNo = transaction.getToAccount();
		Query q = entityManager.createQuery("select b from Beneficiary b where b.transID=:id");
		q.setParameter("em", accNo);
		boolean bool = (UserDetails)q.getSingleResult();
		if(bool) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
