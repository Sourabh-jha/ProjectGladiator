package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bank.entity.Login;

@Repository
public class RegistrationRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addUserDetails(Login login) {
		entityManager.persist(login);
	}

	public long existByUsername(String username) {
		Query q = entityManager.createQuery("select count(l) from Login l where l.username=:un");
		q.setParameter("un", username);
		return (Long)q.getSingleResult();
	}

}