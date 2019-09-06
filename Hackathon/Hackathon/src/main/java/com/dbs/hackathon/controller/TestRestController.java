package com.dbs.hackathon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@RequestMapping(path="/hello")
	public String sayHello() {
		
		return "Hello";
	}
}
