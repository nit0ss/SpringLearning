package com.cris.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String index() {
		System.out.println("Entrando en Controller, redirect a index.jsp");
		return "index";
	}
}
