package com.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Transactions;
import com.bank.repository.TransactionsRepository;

@Service
public class TransactionsService {

	@Autowired
	private TransactionsRepository transactionRepo;
	
	public boolean neftTransfer(Transactions transaction) {
		return transactionRepo.neftTransfer(transaction);
	}
	
	public boolean checkBene(int toAccount) {
		return transactionRepo.checkBene(toAccount);
	}
	
}
