package com.megatech.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String hellopage() {
		System.out.println("WELCOME TO ENTERPRISE WEBAPP");
		return "WELCOME TO ENTERPRISE WEBAPP";
	}
}
