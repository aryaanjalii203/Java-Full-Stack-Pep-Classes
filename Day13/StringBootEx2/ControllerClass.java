package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ControllerClass {
	@RequestMapping("/show")
	@ResponseBody
	public String showMsg() {
		return "I like JavaScript more"; 
	}
	@RequestMapping("/data")
	@ResponseBody
	public int showData() {
		return 100;
	}
	

}
