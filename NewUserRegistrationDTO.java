package com.maven.easybank.api.DTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class NewUserRegistrationDTO {

	@NotBlank(message = " * Cant be blank")
	private String firstName, lastName;
	@NotBlank(message = " * Cant be blank")
	@Size(min = 4, max = 15, message = " * User Name should be minimum 4 char length and max 15 char")
	private String userName;
	private String accountType;
	Character[] password;
	@AssertTrue(message = " * Accept the Terms & Condition")
	private boolean termsCondition;

	private CommunicationDTO communicationDTO;

		public Character[] getPassword() {
		return password;
	}

	public void setPassword(Character[] password) {
		this.password = password;
	}

	public boolean isTermsCondition() {
		return termsCondition;
	}

	public void setTermsCondition(boolean termsCondition) {
		this.termsCondition = termsCondition;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

}
