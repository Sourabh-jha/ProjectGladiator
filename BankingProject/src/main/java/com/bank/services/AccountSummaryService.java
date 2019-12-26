package com.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Transactions;
import com.bank.repository.TransactionsRepository;

@Service
public class AccountSummaryService {

	@Autowired
	private TransactionsRepository transactionRepository;
	
	public List<Transactions> fetchPreviousTransactions(int accountNo) {
		return transactionRepository.fetchPreviousTransactions(accountNo);
	}

}
