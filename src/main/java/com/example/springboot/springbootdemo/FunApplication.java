package com.example.springboot.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunApplication {
	
	@GetMapping("/")
	public String WelcomeController() {
		System.out.println("first controller-");
		return "Hello World";
		
	}
}
