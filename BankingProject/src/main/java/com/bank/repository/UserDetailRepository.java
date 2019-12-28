package com.bank.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.dto.UserDetailsDto;
import com.bank.entity.Address;
import com.bank.entity.Login;
import com.bank.entity.UserDetails;


@Repository
public class UserDetailRepository  {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addNewUser(UserDetails userDetails) {
		entityManager.persist(userDetails);
		
	}

	public void updateNewUser(UserDetails userDetails) {
		entityManager.merge(userDetails);
		
	}
	
	@Transactional
	public boolean updateUser(UserDetails userDetails) {
		try {
		entityManager.merge(userDetails);
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void deleteNewUser(UserDetails userDetails) {
		entityManager.remove(userDetails);
		
	}
	public UserDetails fetchAccount(int accountNo) {
		UserDetails acc = entityManager.find(UserDetails.class, accountNo);
		return acc;
	}

	public List<UserDetailsDto> getUserDetailsList() {
		Query q=entityManager.createQuery("select u from UserDetailsDto u");
		return q.getResultList();	
		}
	
	@Transactional
	public boolean addANewUser(UserDetails userDetails,Address address) {
		try {
			entityManager.merge(userDetails);
			entityManager.merge(address);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Login fetchUser(String username) {
		Login user = entityManager.find(Login.class, username);
		return user;
	}

	public List<UserDetails> getUserDetails() {
		Query q=entityManager.createQuery("select u from UserDetails u where u.approved=:ap");
		q.setParameter("ap", "NO");
		return q.getResultList();
	}

	public List<UserDetails> getUserDetailsByUsername(String username) {
		Query q=entityManager.createQuery("select u from UserDetails u where username=:un");
		q.setParameter("un", username);
		return q.getResultList();
	}

	public UserDetails getUserDetailsByaccNo(int accountNo) {
		UserDetails user = entityManager.find(UserDetails.class, accountNo);
		return user;
	}

	public boolean changePassword(Login details) {
		try {
			entityManager.merge(details);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	

}