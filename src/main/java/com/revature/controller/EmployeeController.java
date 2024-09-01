package com.revature.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping("/greet")
	public String welcome() {
		return "Welcome Rajesh";
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello Rajesh";
	}
	@GetMapping("/master")
	public String master() {
		return "hello Master Rajesh";
	}
}
