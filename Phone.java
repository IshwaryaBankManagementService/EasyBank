package com.maven.easybank.api.DTO;

public class Phone {
	private int countryCode;
	private int phone;

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return getCountryCode() + "-" + getPhone();
	}

}
