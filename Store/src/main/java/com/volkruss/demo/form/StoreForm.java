package com.volkruss.demo.form;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class StoreForm {
	@NotBlank
	private String name;
	private String district;
}
