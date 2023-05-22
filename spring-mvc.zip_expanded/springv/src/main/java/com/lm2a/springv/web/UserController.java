package com.lm2a.springv.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lm2a.model.User;

@Controller
public class UserController {

	@GetMapping("/usuario")
	public String index(Model model) {
		User u = new User("Mario","mario@mail");
		model.addAttribute("usu",u);
		return "index";
	}
	
	
}
