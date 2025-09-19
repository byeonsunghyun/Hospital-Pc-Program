package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController{
	
	@GetMapping("/")
	public String test() {
	    return "test";
	}
	
	@GetMapping("/test2")
	public String test2() {
	    return "test2";
	}
}