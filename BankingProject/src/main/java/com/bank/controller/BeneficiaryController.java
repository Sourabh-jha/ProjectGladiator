
package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.dto.BeneficiaryDto;
import com.bank.services.BeneficiaryService;

@Controller
public class BeneficiaryController {

	@Autowired
	BeneficiaryService benservice;
	
	@RequestMapping(path = "/beneficiary.lti", method = RequestMethod.POST)
	public String benaccno(BeneficiaryDto beneficiaryDto, ModelMap model) {		
		boolean bool = benservice.addbeneficiary(beneficiaryDto);
		if (bool) {		
			return "fundTransfer.jsp";
			}
		else
		{
			model.put("message", "Accno does not exist ");
			return "beneficiary.jsp";
		}
	}	
}
