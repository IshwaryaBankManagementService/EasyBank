package com.maven.easybank.api.DTO;

import javax.validation.constraints.Email;

public class CommunicationDTO {
	@Email
	private String email;
	private Phone phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
