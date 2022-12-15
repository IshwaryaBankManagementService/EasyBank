package com.maven.easybank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maven.easybank.api.DAO.AccountDetails;
import com.maven.easybank.api.DAO.AccountDetailsDAO;
import com.maven.easybank.api.DAO.CustomerDetails;
import com.maven.easybank.api.DAO.CustomerDetailsDAO;

import com.maven.easybank.api.DTO.UserChoiceWithdrDepositDTO;
import com.maven.easybank.api.DTO.UserInfoDTO;

@Controller
public class WelcomePageController {

	@Autowired
	private AccountDetailsDAO AcctDetailsDAO;
	@Autowired
	private CustomerDetailsDAO custDetailDAO;

	@RequestMapping("/")
	public String homePage() {

		return "homePage";
	}

	@RequestMapping("login")
	public String loginPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {

		return "login";

	}

	@RequestMapping("process-validation")
	public String validationCheck(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result,
			@ModelAttribute("userDet") UserChoiceWithdrDepositDTO userChoiceWithdrDepositDTO, Model model) {
		if (result.hasErrors())
			return "login";
		else {
			List<CustomerDetails> customerDet = (List<CustomerDetails>) custDetailDAO
					.getDetails(userInfoDTO.getUserName(), userInfoDTO.getPassword());
			model.addAttribute("customer", customerDet);
			List<AccountDetails> accountDet = (List<AccountDetails>) AcctDetailsDAO
					.getDetails(userInfoDTO.getUserName(), userInfoDTO.getPassword());
			model.addAttribute("account", accountDet);
			return "welcome";
		}
	}

	@RequestMapping("process-welcome")
	public String welcomePage() {

		return "welcome";
	}
}
