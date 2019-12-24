package com.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dto.BeneficiaryDto;
import com.bank.entity.Beneficiary;
import com.bank.repository.BeneficiaryRepository;

@Service
public class BeneficiaryService {
	
	
	@Autowired
	private BeneficiaryRepository benrepo;		
		
	public boolean  addbeneficiary(BeneficiaryDto beneficiaryDto) {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setUsername(benrepo.fetchUsername(beneficiaryDto.getUsernameBene()));
		beneficiary.setBeneAccountNo(benrepo.fetchAccount(beneficiaryDto.getBeneAccountNoBene()));
		beneficiary.setBankName("Hera Pheri Bank");
		beneficiary.setNickname(beneficiaryDto.getNicknameBene());
		boolean check = benrepo.addNewBeneficiary(beneficiary);
		if(check) {
			return true;
		}
		return false;
	}
	
}
