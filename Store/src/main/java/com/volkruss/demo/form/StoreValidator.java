package com.volkruss.demo.form;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class StoreValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// ’èŒ^“I‚È‘‚«•û
		return StoreForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		StoreForm form = (StoreForm)target;
		if(form.getName().length() > 8 && form.getDistrict().length() < 6) {
			errors.rejectValue("district", "error.required", "name‚ª6•¶ŽšˆÈã‚ÌŽž‚Édistrict‚ª6ˆÈ‰º‚Å‚ ‚é•K—v‚ª‚ ‚è‚Ü‚·");
		}
	}

}
