package com.maven.easybank.fomatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.maven.easybank.api.DTO.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		return phone.getCountryCode() + "-" + phone.getPhone();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
	
		String phoneNum[]= completePhoneNumber.split("-");
		Phone phone = new Phone();
		int countryCode = Integer.parseInt(phoneNum[0]);
		int phoneNumber = Integer.parseInt(phoneNum[1]);
		phone.setCountryCode(countryCode); 
		phone.setPhone(phoneNumber); 
		return phone;
	}
}
