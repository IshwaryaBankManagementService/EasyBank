package com.maven.easybank.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maven.easybank.api.DTO.UserChoiceWithdrDepositDTO;

@Controller
public class UserWithdrDepositController {
	
	@RequestMapping("process-choice")
	public String withdrawDepositPage(@ModelAttribute("userAction") UserChoiceWithdrDepositDTO userChoiceWithdrDepositDTO) {
		return "withdrawdeposit";
	}

}
