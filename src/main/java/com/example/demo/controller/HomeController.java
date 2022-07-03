package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class HomeController {

	@GetMapping("/all")
	public String surprise()
	{
		return "this is hello World";
	}
	
	
	@GetMapping("/home")
	@PreAuthorize("hasRole('ADMIN')")
	public String home()
	{
		return "This is my home";
	}
	
	@GetMapping("/welcome")
	@PreAuthorize("hasRole('USER')")
	public String welcome()
	{
		return "This is welcome page";
	}
}
