package com.volkruss.demo.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.demo.entity.Store;
import com.volkruss.demo.form.StoreForm;
import com.volkruss.demo.form.StoreValidator;
import com.volkruss.demo.repository.StoreRepository;


@RestController
public class StoreHandler {

	@Autowired
	private StoreRepository storeRepository;
	
	@Autowired
	private StoreValidator storeValidator;
	
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping("/message")
	public String getMessage(){
		return this.messageSource.getMessage("M_MESSAGE01", new String[] {"Store"}, null);
	}
	
	@RequestMapping("/all")
	public List<Store> findAll() {
		List<Store> stores = this.storeRepository.findAll();
		return stores;
	}
	
	@RequestMapping("/get/{id}")
	public Store get(@PathVariable("id") int id) {
		Store store = this.storeRepository.findById(id);
		return store;
	}
	
	@PostMapping("/save")
	public Store save(@Validated @RequestBody StoreForm storeForm,BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()) {
			bindingResult.getAllErrors().stream().forEach(System.out::println);
			throw new Exception();
		}
		System.out.print(storeForm);
		Store store = new Store();
		store.setName(storeForm.getName());
		store.setDistrict(storeForm.getDistrict());
		return store;
	}
	
	@InitBinder
	public void validatorBinder(WebDataBinder binder) {
		binder.addValidators(this.storeValidator);
	}
}
