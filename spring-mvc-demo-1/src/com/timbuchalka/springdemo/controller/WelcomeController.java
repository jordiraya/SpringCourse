package com.timbuchalka.springdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timbuchalka.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	// http://localhost:8080/spring
	public String doWelcome(Model model) {
		
		// 1. Retrieving the processed data
		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Jordi");
		
		// 2. Add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		return "weolcomeNew"; // name of the view (jsp)
	}

}
