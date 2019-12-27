package com.bank.services;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.bank.dto.FundTransferDto;
import com.bank.entity.Transactions;
import com.bank.entity.UserDetails;
import com.bank.repository.TransactionsRepository;

@Service
public class TransactionsService {

	@Autowired
	private TransactionsRepository transactionRepo;
		
	public Transactions fetchTransaction(FundTransferDto fundTransferDto) {
		Transactions transaction = new Transactions();
		String mode = fundTransferDto.getTransferMode();
		LocalDate today =  LocalDate.now();
		LocalTime time = LocalTime.now();
		transaction.setTransMode(mode);
		transaction.setTransDate(today);
		transaction.setFromAccount(transactionRepo.fetchAccount(fundTransferDto.getFromAccountNo()));
		transaction.setToAccount(transactionRepo.fetchAccount(fundTransferDto.getToAccountNo()));
		transaction.setAmount(fundTransferDto.getAmount());
		transaction.setRemark(fundTransferDto.getRemark());
		transaction.setApproved("NO");
		if(mode.equals("WithinBank")) {
			return transaction;
		}
		else if(mode.equals("NEFT")) {
			String day = today.getDayOfWeek().name();
			if(day.equals("SUNDAY")) {
				System.out.println("TODAY IS SUNDAY MAN!!");
				return null;
			}
			else if(day.equals("SATURDAY")) {
				if((time.isAfter(LocalTime.parse( "08:00:00" ))) && (time.isBefore(LocalTime.parse( "13:00:00" )))) {
					return transaction;
				}
				else {
					System.out.println("TODAY IS SATURDAY, TIMING FOR NEFT PAMENT IS BETWEEN 8am and 1pm!!");
					return null;
				}
			}
			else {
				if((time.isAfter(LocalTime.parse( "08:00:00" ))) && (time.isBefore(LocalTime.parse( "18:30:00" )))) {
					return transaction;
				}
				else { 
					System.out.println("TIMING FOR NEFT PAMENT IS BETWEEN 8.00am and 6.30pm!!");
					return null;
				}
			}
		}
		else if(mode.equals("RTGS")) {
			if((time.isAfter(LocalTime.parse( "07:00:00" ))) && (time.isBefore(LocalTime.parse( "18:00:00" )))) {
				if(fundTransferDto.getAmount() >= 200000) {
					return transaction;
				}
				else {
					System.out.println("MINIMUM TANSACTION LIMIT IS RS 2 LAKH!!");
					return null;
				}
			}
			else {
				System.out.println("TIMING FOR RTGS PAMENT IS BETWEEN 7.00am and 6.00pm!!");
				return null;
			}
		}
		else if(mode.equals("IMPS")) {
			if(fundTransferDto.getAmount() <= 200000) {
				return transaction;
			}
			else {
				System.out.println("MAXIMUM TANSACTION LIMIT IS RS 2 LAKH!!");
				return null;
			}
		}
		return null;
	}

	public Transactions initiateTransfer(FundTransferDto fundTransferDto) {	
		UserDetails Payer = transactionRepo.fetchAccount(fundTransferDto.getFromAccountNo());
		UserDetails Payee = transactionRepo.fetchAccount(fundTransferDto.getToAccountNo());
		if(Payer.getBalance() < fundTransferDto.getAmount()) {
			System.out.println("LOW BALANCE!!");
		}
		else {
			Transactions trans = transactionRepo.fundTransfer(fetchTransaction(fundTransferDto));
			if(trans != null) {
				int initialPayerAmount = Payer.getBalance();
				int initialPayeeAmount = Payee.getBalance();
				Payer.setBalance(initialPayerAmount-(fundTransferDto.getAmount()));
				transactionRepo.modifyChanges(Payer);
				Payee.setBalance(initialPayeeAmount+(fundTransferDto.getAmount()));
				transactionRepo.modifyChanges(Payee);
				System.out.println("SUCCESS TRANSFER!!");
				Transactions lastTrans = transactionRepo.extractLastTransaction();
				return lastTrans;
			}
		}
		return null;
	}
	
	
}
