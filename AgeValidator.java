package com.maven.easybank.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Password, Character
>{

	@Override
	public boolean isValid(Character value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
