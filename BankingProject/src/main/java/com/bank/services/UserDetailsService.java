package com.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dto.UserDetailsDto;
import com.bank.entity.Address;
import com.bank.entity.UserDetails;
import com.bank.repository.AddressRepository;
import com.bank.repository.UserDetailsRepository;
@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@Autowired
	private UserDetails user;
	
	private AddressRepository addressRepository;
	
	public boolean openAccount(UserDetailsDto userDetailsDto)
	{
		UserDetails userDetails =new UserDetails();
		
		
		userDetails.setTitle(userDetailsDto.getUsertitle());
		userDetails.setFirstname(userDetailsDto.getUserfirstname());
		userDetails.setLastname(userDetailsDto.getUserlastname());
		userDetails.setMiddlename(userDetailsDto.getUsermiddlename());
		userDetails.setFathername(userDetailsDto.getUserfathername());
		userDetails.setEmailId(userDetailsDto.getUseremailId());
		userDetails.setOccupation(userDetailsDto.getUserOccupation());
		userDetails.setDob(userDetailsDto.getUserdob());
		userDetails.setAadharNo(userDetailsDto.getUseraadharNo());
		userDetails.setIncome(userDetailsDto.getUserincome());
//		userDetails.setUsername(username);
		userDetails.setMobileNo(userDetailsDto.getUsermobileNo());
		userDetails.setNetBanking("YES");
		userDetails.setApproved("NO");	
		
		userDetailsRepository.addNewUser(userDetails);
		//userDetailsRepository.updateNewUser(userDetails);
		//userDetailsRepository.deleteNewUser(userDetails);

		addAddress(userDetailsDto);
		return true;
	
	}

	public boolean addAddress(UserDetailsDto userDetailsDto) {
		Address address=new Address();
		
		address.setAddress1(userDetailsDto.getUseraddress1());
		address.setAddress2(userDetailsDto.getUseraddress2());
		address.setAddType(userDetailsDto.getUseraddType());
		address.setCity(userDetailsDto.getUsercity());
		address.setLandmark(userDetailsDto.getUserlandmark());
		address.setPincode(userDetailsDto.getUserpincode());
		address.setState(userDetailsDto.getUserstate());
		
		addressRepository.addNewAddress(address);
		//addressRepository.updateNewAddress(address);
		//addressRepository.deleteNewAddress(address);

		addAddress(userDetailsDto);
		return true;
		
	}

}
	
	
	
	


