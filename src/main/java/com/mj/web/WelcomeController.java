package com.mj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="index.html")
	public String welcome(){
		System.out.println("---");
		return "welcome";
	}

}
