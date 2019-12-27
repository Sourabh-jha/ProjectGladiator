package com.bank.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dto.FundTransferDto;
import com.bank.entity.Transactions;
import com.bank.repository.TransactionsRepository;

@Service
public class TransactionsService {

	@Autowired
	private TransactionsRepository transactionRepo;
	
//	public boolean neftTransfer(Transactions transaction) {
//		System.out.println("In Service-> neftTransfer");
//		return transactionRepo.neftTransfer(transaction);
//	}
	
//	public boolean checkBene(int toAccount) {
//		System.out.println("In Service-> CheckBean");
//		return transactionRepo.checkBene(toAccount);
//	}

	public boolean initiateTransfer(FundTransferDto fundTransferDto) {
		Transactions transaction = new Transactions();
		transaction.setFromAccount(transactionRepo.fetchAccount(fundTransferDto.getFromAccountNo()));
		transaction.setToAccount(transactionRepo.fetchAccount(fundTransferDto.getToAccountNo()));
		transaction.setAmount(fundTransferDto.getAmount());
		transaction.setRemark(fundTransferDto.getRemark());
		transaction.setTransDate(LocalDate.now());
		transaction.setTransMode("NEFT");
		transaction.setApproved("NO");
		
		boolean check = transactionRepo.fundTransfer(transaction);
		if(check) {
			return true;
		}
		return false;
	}
	
}
