package com.maven.easybank.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maven.easybank.api.DTO.NewUserRegistrationDTO;

@Controller
public class UserCreationOrLoginController {

	@RequestMapping("process-register")
	public String newUserRegistrationPage(@ModelAttribute("userReg") NewUserRegistrationDTO newUserRegDTO) {

		return "newuserRegistration";
	}

	@RequestMapping("process-regsuccess")
	public String newUserregisterSuccessPage(@Valid @ModelAttribute("userReg") NewUserRegistrationDTO newUserRegDTO,
			BindingResult result) {
		if (result.hasErrors())
			return "newuserRegistration";
		else
			return "registerSuccess";
	}

}
