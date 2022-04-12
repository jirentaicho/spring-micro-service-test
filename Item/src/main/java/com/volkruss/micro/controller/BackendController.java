package com.volkruss.micro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
	@RequestMapping("/hello")
	public String hello() {
		return "Ç±ÇÒÇ…ÇøÇÕÅI";
	}
}
