package com.bank.controller;

import java.beans.PropertyEditorSupport;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.bank.dto.AddressDto;
import com.bank.dto.UserDetailsDto;
import com.bank.entity.UserDetails;
import com.bank.services.UserDetailService;

@Controller
@SessionAttributes("loggedInUser")
public class UserDetailController {
	
	@Autowired
	private UserDetailService userDetailsService;
	
	@RequestMapping(path = "/openAccount.lti",method = RequestMethod.POST)
	public String addANewUser(UserDetailsDto userDetails,AddressDto address, @RequestParam("document") MultipartFile document, ModelMap model) {
		String username = (String) model.get("loggedInUser");
		System.out.println(model.get("loggedInUser"));
		String path = "D:/document/";
		String finalpath = path + document.getOriginalFilename();
		try {
			document.transferTo(new File(finalpath));
		} catch (IOException e) {
			System.out.println("File could't upload!!!");
			e.printStackTrace();
		}
		userDetails.setDocumentName(document.getOriginalFilename());
		userDetails.setUsername(username);
		address.setUsername(username);
		boolean bool = userDetailsService.addANewUser(userDetails, address);
		if(bool) {
			return "dashboard.jsp";
		}
		else{
			return null;
		}
		
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	  binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
	    @Override
	    public void setAsText(String text) throws IllegalArgumentException{
	      setValue(LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	    }
	  });
	}	
}