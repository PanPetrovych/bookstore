package com.serhiyko.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LandingController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String landing(Model model) {
		model.addAttribute("greeting", "Welcome to our Book Store!");
		return "landing";
	}
}