package com.megatech.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	

	@GetMapping(value = { "/", "" })
	public String hellopage() {
		System.out.println("WELCOME TO ENTERPRISE WEBAPP");
		return "WELCOME TO ENTERPRISE WEBAPP";
	}

}
