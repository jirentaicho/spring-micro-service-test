package com.volkruss.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreHandler {

	@RequestMapping("/all")
	public String findAll() {
		return "Žæ“¾‚µ‚Ü‚µ‚½";
	}
	
}
