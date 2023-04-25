package com.whatsappdemo.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nemo {
	@GetMapping("/hi")
	public String map() {
		return "csk";
	}
}


