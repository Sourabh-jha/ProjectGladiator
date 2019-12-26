package com.bank.repository;

import java.time.LocalDate;
import java.util.List;

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
	Transactions trans = null;
	
	@Transactional
	public Transactions fundTransfer(Transactions transaction) {
		try {
			trans = entityManager.merge(transaction);
			return trans;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Transactions extractLastTransaction() {
		Query q = entityManager.createQuery("select t from Transactions t");
		List<Transactions> lastTrans = q.getResultList();
		int length = lastTrans.size()-1;
		return lastTrans.get(length);
	}


	@Transactional
	public void modifyChanges(UserDetails modify) {
		try {
		entityManager.merge(modify);		
		}catch(Exception e) {
			System.out.println("Error is here...");
			e.printStackTrace();
		}
	}
	
	public UserDetails fetchAccount(int accountNo) {
		UserDetails acc = entityManager.find(UserDetails.class, accountNo);
		return acc;
	}

	public List<Transactions> fetchPreviousTransactions(int accountNo) {
		try {
		UserDetails userDetails = entityManager.find(UserDetails.class, accountNo);
		Query q = entityManager.createQuery("select t from Transactions t where t.fromAccount=:an");
		q.setParameter("an", userDetails);
		List<Transactions> previousTrans = q.getResultList();
		return previousTrans;
		}catch(Exception e) {
			System.out.println("Error idhar hai bro!!!");
			e.printStackTrace();
		}
		return null;
	}

	public List<Transactions> fetchTransactionsViaDate(LocalDate fromDate, LocalDate toDate, int accountNo) {
		try {
			UserDetails userDetails = entityManager.find(UserDetails.class, accountNo);
			Query q = entityManager.createQuery("select t from Transactions t where t.fromAccount=:an and t.transDate BETWEEN TO_DATE (:fd, 'dd/mm/yy') AND TO_DATE (:td, 'dd/mm/yy')");
			q.setParameter("an", userDetails);
			q.setParameter("fd", fromDate);
			q.setParameter("td", toDate);
			List<Transactions> previousTrans = q.getResultList();
			return previousTrans;
			}catch(Exception e) {
				System.out.println("Error idhar hai bro!!!");
				e.printStackTrace();
			}
			return null;
	}
	
	
}
