package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bank.entity.Login;

@Repository
public class LoginRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
public boolean check(String username,String password) {
		
		Query q =entityManager.createQuery("select l from Login l where l.username = :user and l.password =:pwd ");
		q.setParameter("user", username);
		q.setParameter("pwd", password);
		
		if((Login)q.getSingleResult() != null) {
			return true;
		}	
		return false;
	}
	
	
}
