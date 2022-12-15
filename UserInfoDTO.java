package com.maven.easybank.api.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.maven.easybank.Validator.Password;

public class UserInfoDTO {
	@Min(value = 1, message = "* Required")
	@Max(value = 7, message = "* Enter valid input")
	private int userName;
	@Password(lower = 5, message = "* Required minimum of 5 character")
	Character[] password;

	public int getUserName() {
		return userName;
	}

	public void setUserName(int userName) {
		this.userName = userName;
	}

	public Character[] getPassword() {
		return password;
	}

	public void setPassword(Character[] password) {
		this.password = password;
	}


}