package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerClass {
	@RequestMapping("/show")
	public String showMsg() {
		return "I like JavaScript more"; 
	}
	@RequestMapping("/data")
	
	public int showData() {
		return 100;
	}
	@GetMapping("/accept/{usedData}")
	
	public String showParameter(@PathVariable("usedData") Integer v1) {
		return String.valueOf(v1);
	}
	
}
