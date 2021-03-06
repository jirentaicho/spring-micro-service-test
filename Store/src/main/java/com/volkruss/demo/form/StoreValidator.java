package com.volkruss.demo.form;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class StoreValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// 定型的な書き方
		return StoreForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		StoreForm form = (StoreForm)target;
		if(form.getName().length() > 8 && form.getDistrict().length() < 6) {
			errors.rejectValue("district", "error.required", "nameが6文字以上の時にdistrictが6以下である必要があります");
		}
	}

}
