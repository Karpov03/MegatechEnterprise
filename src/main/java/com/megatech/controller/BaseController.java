package com.megatech.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megatech.logics.MainLogics;

@RestController
public class BaseController {
	@Autowired
	MainLogics mainLogic;

	@GetMapping(value = { "/", "" })
	public String hellopage() {
		System.out.println("WELCOME TO ENTERPRISE WEBAPP");
		return "WELCOME TO ENTERPRISE WEBAPP";
	}

	@GetMapping(value = { "/avg" })
	public List<?> average() {
		System.out.println("Computing Average");
		 return mainLogic.findAll();
	}
}
