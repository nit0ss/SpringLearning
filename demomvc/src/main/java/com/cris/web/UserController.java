package com.cris.web;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cris.model.User;

@Controller
public class UserController {

	@GetMapping("/user")
	public String index(Model model) {
		User user = new User("John Doe", "john@example.com"); 
		model.addAttribute("user",user);
		return "index";
	}
	
	
}
