package com.bank.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Transactions;
import com.bank.repository.TransactionsRepository;

@Service
public class AccountStatementService {

	@Autowired
	private TransactionsRepository transactionsRepository; 
	
	public List<Transactions> fetchAccountStatement(LocalDate fromDate, LocalDate toDate, int accountNo) {
		return transactionsRepository.fetchTransactionsViaDate(fromDate, toDate, accountNo);
	}

}
