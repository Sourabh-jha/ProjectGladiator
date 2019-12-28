package com.bank.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dto.AddressDto;
import com.bank.dto.UserDetailsDto;
import com.bank.entity.Address;
import com.bank.entity.Login;
import com.bank.entity.UserDetails;
import com.bank.repository.UserDetailRepository;

@Service
public class UserDetailService {
	
	@Autowired
	private UserDetailRepository userDetailsRepository;
	
	public List<UserDetailsDto> getUserDetailsList() {
		return userDetailsRepository.getUserDetailsList();
	}
	
	public boolean addANewUser(UserDetailsDto userDetailsDto,AddressDto addressDto) {
		UserDetails userDetails = new UserDetails();
		Login user = userDetailsRepository.fetchUser(userDetailsDto.getUsername());
		userDetails.setUsername(user);
		userDetails.setAadharNo(userDetailsDto.getUseraadharNo());
		userDetails.setDob(userDetailsDto.getUserdob());
		userDetails.setEmailId(userDetailsDto.getUseremailId());
		userDetails.setFathername(userDetailsDto.getUserfathername());
		userDetails.setFirstname(userDetailsDto.getUserfirstname());
		userDetails.setMiddlename(userDetailsDto.getUsermiddlename());
		userDetails.setLastname(userDetailsDto.getUserlastname());
		userDetails.setIncome(userDetailsDto.getUserincome());
		userDetails.setMobileNo(userDetailsDto.getUsermobileNo());
		userDetails.setNetBanking(userDetailsDto.getUsernetBanking());
		userDetails.setOccupation(userDetailsDto.getUserOccupation());
		userDetails.setApproved("NO");
		userDetails.setBalance(0);
		Address address = new Address();
		address.setUsername(user);
		address.setAddress1(addressDto.getAddressLine1());
		address.setAddress2(addressDto.getAddressLine2());
		address.setCity(addressDto.getCity());
		address.setLandmark(addressDto.getLandmark());
		address.setPincode(addressDto.getPincode());
		address.setState(addressDto.getState());
		address.setAddType("Permanent");
		return userDetailsRepository.addANewUser(userDetails, address);
	}

	public Login fetchUser(String username) {
		return userDetailsRepository.fetchUser(username);
	}

	
}