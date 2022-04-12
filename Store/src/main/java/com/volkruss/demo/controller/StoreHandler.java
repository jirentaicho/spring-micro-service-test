package com.volkruss.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.demo.entity.Store;
import com.volkruss.demo.repository.StoreRepository;


@RestController
public class StoreHandler {

	@Autowired
	private StoreRepository storeRepository;
	
	@RequestMapping("/all")
	public List<Store> findAll() {
		List<Store> stores = this.storeRepository.findAll();
		return stores;
	}
	
	@RequestMapping("/get")
	public Store get() {
		Store store = this.storeRepository.findById(1);
		return store;
	}
	
}
