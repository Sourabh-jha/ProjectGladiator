package com.bank.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.entity.Address;



@Repository
public class AddressRepository  {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addNewAddress(Address address) {
		entityManager.persist(address);
		
	}

	public void updateNewAddress(Address address) {
		entityManager.merge(address);
		
	}

	public void deleteNewAddress(Address address) {
		entityManager.remove(address);
		
	}
	

}
