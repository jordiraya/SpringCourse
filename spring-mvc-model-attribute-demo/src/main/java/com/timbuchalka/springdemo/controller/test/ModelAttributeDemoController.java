package com.timbuchalka.springdemo.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttributeDemoController {

	private static Logger LOGGER = LoggerFactory.getLogger(ModelAttributeDemoController.class);
	
	@RequestMapping(value = "/home")
	public String home() {
		LOGGER.info("INSIDE home: " + System.currentTimeMillis());
		return "modelAttributeHome";
	}
	
	/*
	* Test series to determine the nature of the @ModelAttribute annotation (on a method)
	*/
	
	// Demostrating the use of the @ModelAttribute annotation (on a method) to add multiple attributes
	@ModelAttribute
	public void modelAttribueTest1(Model model) {
		LOGGER.info("INSIDE modelAttribueTest1: " + System.currentTimeMillis());
		model.addAttribute("testdata1A", "Welcome to the @ModelAttribute test bed!");
		model.addAttribute("testdata1B", "We will test both usages of the @ModelAttribute, on methods and on method arguments");
	}
	
}
